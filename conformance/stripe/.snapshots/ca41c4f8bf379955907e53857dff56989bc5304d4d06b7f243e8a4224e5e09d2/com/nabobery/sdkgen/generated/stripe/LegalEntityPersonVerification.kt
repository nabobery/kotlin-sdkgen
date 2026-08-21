package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_person_verification
 */
@Serializable(with = LegalEntityPersonVerification.Serializer::class)
public class LegalEntityPersonVerification(
  /**
   * The state of verification for the person. Possible values are `unverified`, `pending`, or `verified`. Please refer
   * [guide](https://docs.stripe.com/connect/handling-api-verification) to handle verification updates.
   */
  public val status: String,
  /**
   * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
   */
  public val additionalDocument:
      InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d? = null,
  /**
   * A user-displayable string describing the verification state for the person. For example, this may say "Provided
   * identity information could not be verified".
   */
  public val details: String? = null,
  /**
   * One of `document_address_mismatch`, `document_dob_mismatch`, `document_duplicate_type`,
   * `document_id_number_mismatch`, `document_name_mismatch`, `document_nationality_mismatch`, `failed_keyed_identity`,
   * or `failed_other`. A machine-readable code specifying the verification state for the person.
   */
  public val detailsCode: String? = null,
  public val document: LegalEntityPersonVerificationDocument? = null,
) {
  public class Builder {
    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
     */
    public var additionalDocument: InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d? =
        null

    /**
     * A user-displayable string describing the verification state for the person. For example, this may say "Provided
     * identity information could not be verified".
     */
    public var details: String? = null

    /**
     * One of `document_address_mismatch`, `document_dob_mismatch`, `document_duplicate_type`,
     * `document_id_number_mismatch`, `document_name_mismatch`, `document_nationality_mismatch`,
     * `failed_keyed_identity`, or `failed_other`. A machine-readable code specifying the verification state for the
     * person.
     */
    public var detailsCode: String? = null

    public var document: LegalEntityPersonVerificationDocument? = null

    public fun build(): LegalEntityPersonVerification {
      check(statusValue != null) { "status is required" }
      return LegalEntityPersonVerification(
        status = status,
        additionalDocument = additionalDocument,
        details = details,
        detailsCode = detailsCode,
        document = document,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LegalEntityPersonVerification = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LegalEntityPersonVerification> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegalEntityPersonVerification {
      val jsonDecoder = decoder.requireJsonDecoder("LegalEntityPersonVerification")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LegalEntityPersonVerification must be a JSON object")
      val status = json.decodeRequired<String>(rawObject, "status")
      return LegalEntityPersonVerification(
        status = status,
        additionalDocument = rawObject["additional_document"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityPersonVerificationAdditionalDocumentXcccff13d?>(element) },
        details = rawObject["details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        detailsCode = rawObject["details_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        document = rawObject["document"]?.let { json.decodeFromJsonElement<LegalEntityPersonVerificationDocument>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegalEntityPersonVerification) {
      val jsonEncoder = encoder.requireJsonEncoder("LegalEntityPersonVerification")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", value.status)
        value.additionalDocument?.let { put("additional_document", json.encodeToJsonElement(it)) }
        value.details?.let { put("details", it) }
        value.detailsCode?.let { put("details_code", it) }
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun legalEntityPersonVerification(block: LegalEntityPersonVerification.Builder.() -> Unit): LegalEntityPersonVerification = LegalEntityPersonVerification.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LegalEntityPersonVerification is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
