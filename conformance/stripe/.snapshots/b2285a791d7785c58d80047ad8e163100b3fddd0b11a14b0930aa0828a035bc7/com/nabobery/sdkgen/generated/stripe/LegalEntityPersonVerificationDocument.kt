package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class LegalEntityPersonVerificationDocumentView(
  public val back: InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c? = null,
  public val details: String? = null,
  @SerialName("details_code")
  public val detailsCode: String? = null,
  public val front: InlineLegalEntityPersonVerificationDocumentFrontX647b8abe? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_person_verification_document
 */
@Serializable(with = LegalEntityPersonVerificationDocument.Serializer::class)
public class LegalEntityPersonVerificationDocument(
  /**
   * The back of an ID returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
   * `identity_document`.
   */
  public val back: InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c? = null,
  /**
   * A user-displayable string describing the verification state of this document. For example, if a document is
   * uploaded and the picture is too fuzzy, this may say "Identity document is too unclear to read".
   */
  public val details: String? = null,
  /**
   * One of `document_corrupt`, `document_country_not_supported`, `document_expired`, `document_failed_copy`,
   * `document_failed_other`, `document_failed_test_mode`, `document_fraudulent`, `document_failed_greyscale`,
   * `document_incomplete`, `document_invalid`, `document_manipulated`, `document_missing_back`,
   * `document_missing_front`, `document_not_readable`, `document_not_uploaded`, `document_photo_mismatch`,
   * `document_too_large`, or `document_type_not_supported`. A machine-readable code specifying the verification state
   * for this document.
   */
  public val detailsCode: String? = null,
  /**
   * The front of an ID returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
   * `identity_document`.
   */
  public val front: InlineLegalEntityPersonVerificationDocumentFrontX647b8abe? = null,
) {
  public class Builder {
    /**
     * The back of an ID returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
     * `identity_document`.
     */
    public var back: InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c? = null

    /**
     * A user-displayable string describing the verification state of this document. For example, if a document is
     * uploaded and the picture is too fuzzy, this may say "Identity document is too unclear to read".
     */
    public var details: String? = null

    /**
     * One of `document_corrupt`, `document_country_not_supported`, `document_expired`, `document_failed_copy`,
     * `document_failed_other`, `document_failed_test_mode`, `document_fraudulent`, `document_failed_greyscale`,
     * `document_incomplete`, `document_invalid`, `document_manipulated`, `document_missing_back`,
     * `document_missing_front`, `document_not_readable`, `document_not_uploaded`, `document_photo_mismatch`,
     * `document_too_large`, or `document_type_not_supported`. A machine-readable code specifying the verification state
     * for this document.
     */
    public var detailsCode: String? = null

    /**
     * The front of an ID returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
     * `identity_document`.
     */
    public var front: InlineLegalEntityPersonVerificationDocumentFrontX647b8abe? = null

    public fun build(): LegalEntityPersonVerificationDocument = LegalEntityPersonVerificationDocument(
      back = back,
      details = details,
      detailsCode = detailsCode,
      front = front,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LegalEntityPersonVerificationDocument = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<LegalEntityPersonVerificationDocument> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegalEntityPersonVerificationDocument {
      val jsonDecoder = decoder.requireJsonDecoder("LegalEntityPersonVerificationDocument")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LegalEntityPersonVerificationDocument must be a JSON object")
      return LegalEntityPersonVerificationDocument(
        back = rawObject["back"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityPersonVerificationDocumentBackXd6f30a0c?>(element) },
        details = rawObject["details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        detailsCode = rawObject["details_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        front = rawObject["front"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityPersonVerificationDocumentFrontX647b8abe?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegalEntityPersonVerificationDocument) {
      val jsonEncoder = encoder.requireJsonEncoder("LegalEntityPersonVerificationDocument")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.back?.let { put("back", json.encodeToJsonElement(it)) }
        value.details?.let { put("details", it) }
        value.detailsCode?.let { put("details_code", it) }
        value.front?.let { put("front", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun legalEntityPersonVerificationDocument(block: LegalEntityPersonVerificationDocument.Builder.() -> Unit): LegalEntityPersonVerificationDocument = LegalEntityPersonVerificationDocument.build(block)
