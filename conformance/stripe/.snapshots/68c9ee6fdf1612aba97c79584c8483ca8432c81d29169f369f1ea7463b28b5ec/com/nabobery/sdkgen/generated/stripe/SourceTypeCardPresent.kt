package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_card_present.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_card_present
 */
@Serializable(with = SourceTypeCardPresent.Serializer::class)
public class SourceTypeCardPresent(
  public val applicationCryptogram: String? = null,
  public val applicationPreferredName: String? = null,
  public val authorizationCode: String? = null,
  public val authorizationResponseCode: String? = null,
  public val brand: String? = null,
  public val country: String? = null,
  public val cvmType: String? = null,
  public val dataType: String? = null,
  public val dedicatedFileName: String? = null,
  public val emvAuthData: String? = null,
  public val evidenceCustomerSignature: String? = null,
  public val evidenceTransactionCertificate: String? = null,
  public val expMonth: Int? = null,
  public val expYear: Int? = null,
  public val fingerprint: String? = null,
  public val funding: String? = null,
  public val last4: String? = null,
  public val posDeviceId: String? = null,
  public val posEntryMode: String? = null,
  public val readMethod: String? = null,
  public val reader: String? = null,
  public val terminalVerificationResults: String? = null,
  public val transactionStatusInformation: String? = null,
) {
  public class Builder {
    public var applicationCryptogram: String? = null

    public var applicationPreferredName: String? = null

    public var authorizationCode: String? = null

    public var authorizationResponseCode: String? = null

    public var brand: String? = null

    public var country: String? = null

    public var cvmType: String? = null

    public var dataType: String? = null

    public var dedicatedFileName: String? = null

    public var emvAuthData: String? = null

    public var evidenceCustomerSignature: String? = null

    public var evidenceTransactionCertificate: String? = null

    public var expMonth: Int? = null

    public var expYear: Int? = null

    public var fingerprint: String? = null

    public var funding: String? = null

    public var last4: String? = null

    public var posDeviceId: String? = null

    public var posEntryMode: String? = null

    public var readMethod: String? = null

    public var reader: String? = null

    public var terminalVerificationResults: String? = null

    public var transactionStatusInformation: String? = null

    public fun build(): SourceTypeCardPresent = SourceTypeCardPresent(
      applicationCryptogram = applicationCryptogram,
      applicationPreferredName = applicationPreferredName,
      authorizationCode = authorizationCode,
      authorizationResponseCode = authorizationResponseCode,
      brand = brand,
      country = country,
      cvmType = cvmType,
      dataType = dataType,
      dedicatedFileName = dedicatedFileName,
      emvAuthData = emvAuthData,
      evidenceCustomerSignature = evidenceCustomerSignature,
      evidenceTransactionCertificate = evidenceTransactionCertificate,
      expMonth = expMonth,
      expYear = expYear,
      fingerprint = fingerprint,
      funding = funding,
      last4 = last4,
      posDeviceId = posDeviceId,
      posEntryMode = posEntryMode,
      readMethod = readMethod,
      reader = reader,
      terminalVerificationResults = terminalVerificationResults,
      transactionStatusInformation = transactionStatusInformation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeCardPresent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTypeCardPresent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeCardPresent {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeCardPresent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeCardPresent must be a JSON object")
      return SourceTypeCardPresent(
        applicationCryptogram = rawObject["application_cryptogram"]?.let { json.decodeFromJsonElement<String>(it) },
        applicationPreferredName = rawObject["application_preferred_name"]?.let { json.decodeFromJsonElement<String>(it) },
        authorizationCode = rawObject["authorization_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        authorizationResponseCode = rawObject["authorization_response_code"]?.let { json.decodeFromJsonElement<String>(it) },
        brand = rawObject["brand"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        cvmType = rawObject["cvm_type"]?.let { json.decodeFromJsonElement<String>(it) },
        dataType = rawObject["data_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        dedicatedFileName = rawObject["dedicated_file_name"]?.let { json.decodeFromJsonElement<String>(it) },
        emvAuthData = rawObject["emv_auth_data"]?.let { json.decodeFromJsonElement<String>(it) },
        evidenceCustomerSignature = rawObject["evidence_customer_signature"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        evidenceTransactionCertificate = rawObject["evidence_transaction_certificate"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        expMonth = rawObject["exp_month"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        expYear = rawObject["exp_year"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { json.decodeFromJsonElement<String>(it) },
        funding = rawObject["funding"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        posDeviceId = rawObject["pos_device_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        posEntryMode = rawObject["pos_entry_mode"]?.let { json.decodeFromJsonElement<String>(it) },
        readMethod = rawObject["read_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reader = rawObject["reader"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        terminalVerificationResults = rawObject["terminal_verification_results"]?.let { json.decodeFromJsonElement<String>(it) },
        transactionStatusInformation = rawObject["transaction_status_information"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeCardPresent) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeCardPresent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.applicationCryptogram?.let { put("application_cryptogram", it) }
        value.applicationPreferredName?.let { put("application_preferred_name", it) }
        value.authorizationCode?.let { put("authorization_code", it) }
        value.authorizationResponseCode?.let { put("authorization_response_code", it) }
        value.brand?.let { put("brand", it) }
        value.country?.let { put("country", it) }
        value.cvmType?.let { put("cvm_type", it) }
        value.dataType?.let { put("data_type", it) }
        value.dedicatedFileName?.let { put("dedicated_file_name", it) }
        value.emvAuthData?.let { put("emv_auth_data", it) }
        value.evidenceCustomerSignature?.let { put("evidence_customer_signature", it) }
        value.evidenceTransactionCertificate?.let { put("evidence_transaction_certificate", it) }
        value.expMonth?.let { put("exp_month", json.encodeToJsonElement(it)) }
        value.expYear?.let { put("exp_year", json.encodeToJsonElement(it)) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.funding?.let { put("funding", it) }
        value.last4?.let { put("last4", it) }
        value.posDeviceId?.let { put("pos_device_id", it) }
        value.posEntryMode?.let { put("pos_entry_mode", it) }
        value.readMethod?.let { put("read_method", it) }
        value.reader?.let { put("reader", it) }
        value.terminalVerificationResults?.let { put("terminal_verification_results", it) }
        value.transactionStatusInformation?.let { put("transaction_status_information", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeCardPresent(block: SourceTypeCardPresent.Builder.() -> Unit): SourceTypeCardPresent = SourceTypeCardPresent.build(block)
