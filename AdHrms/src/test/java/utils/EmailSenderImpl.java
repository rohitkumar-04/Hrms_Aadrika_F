package utils;

import java.util.HashMap;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailSenderImpl {

	private HashMap<String, String> hrmsOptions;

	/**
	 * sends the mail to the user.
	 *
	 * @param emailSubject Subject of the eMail.
	 * @param emailContent Content of the eMail.
	 * @param toUser       Receivers eMailId.
	 * @throws Exception Throws exception.
	 */

	public void sendEmail(String emailSubject, String emailContent, String toUser, String ccUser, String attachment)
			throws Exception {
// retrieve host name and sender's e-mail address ( NO-REPLY-MAIL-ADDRESS ).

		boolean isAuthEnabled = true;

//Integer  oPortNumber = Integer.valueOf(sPortNumber);
//int nPortNumber = oPortNumber.intValue();

		Properties emailProperties = new Properties();
		emailProperties.put("mail.transport.protocol", "smtp");
		emailProperties.put("mail.smtp.host", "smtp.sendgrid.net");
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.smtp.port", 000);

		emailProperties.put("mail.smtp.starttls.enable", "true");
		emailProperties.put("mail.debug", "true");

		emailProperties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		emailProperties.put("mail.smtp.from", "rohitadrika04@gmail.com");

		emailProperties.put("mail.smtp.user", "apikey");
		emailProperties.put("mail.smtp.password",
				"");

		Session mailSession = Session.getInstance(emailProperties);
		Transport transport = mailSession.getTransport();

		MimeMessage message = new MimeMessage(mailSession);

// set e-mail Subject
		message.setSubject(emailSubject, "UTF8");

// set email attachment
		if (attachment != null) {
			Multipart multipart = new MimeMultipart();
//FileInputStream file = new FileInputStream(attachment);0
			MimeBodyPart attachFilePart = new MimeBodyPart();
			attachFilePart.attachFile(attachment);
			multipart.addBodyPart(attachFilePart);

			MimeBodyPart attachTextContent = new MimeBodyPart();
			attachTextContent.setContent(emailContent, "text/html; charset=UTF-8");
			multipart.addBodyPart(attachTextContent);

			message.setContent(multipart, Message.ATTACHMENT);
		} else {
// set e-mail content type
			message.setContent(emailContent, "text/html; charset=UTF-8");
		}

// set e-mail sender's address
		message.setFrom(new InternetAddress("rohitadrika04@gmail..com"));

		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toUser));

// send e-mail recipient's address
//message.addRecipient( Message.RecipientType.TO, new InternetAddress( toUser ));

		if (ccUser != null) {
			if (!ccUser.isEmpty()) {
				String[] ccMailList = ccUser.split(";");
				for (String ccEmailAddress : ccMailList)
					message.addRecipient(Message.RecipientType.CC, new InternetAddress(ccEmailAddress));
			}
		}
// send e-mail
//transport.sendMessage( message, message.getRecipients( Message.RecipientType.TO ) );
		transport.connect("apikey", "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");
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();

	}

}
