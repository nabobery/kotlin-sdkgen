package com.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company_verification_document
 */
@Serializable(with = LegalEntityCompanyVerificationDocument.Serializer::class)
public class LegalEntityCompanyVerificationDocument(
  /**
   * The back of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
   * `additional_verification`. Note that `additional_verification` files are [not
   * downloadable](/file-upload#uploading-a-file).
   */
  public val back: InlineLegalEntityCompanyVerificationDocumentBackX113d3925? = null,
  /**
   * A user-displayable string describing the verification state of this document.
   */
  public val details: String? = null,
  /**
   * One of `document_corrupt`, `document_expired`, `document_failed_copy`, `document_failed_greyscale`,
   * `document_failed_other`, `document_failed_test_mode`, `document_fraudulent`, `document_incomplete`,
   * `document_invalid`, `document_manipulated`, `document_not_readable`, `document_not_uploaded`,
   * `document_type_not_supported`, or `document_too_large`. A machine-readable code specifying the verification state
   * for this document.
   */
  public val detailsCode: String? = null,
  /**
   * The front of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
   * `additional_verification`. Note that `additional_verification` files are [not
   * downloadable](/file-upload#uploading-a-file).
   */
  public val front: InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7? = null,
) {
  public class Builder {
    /**
     * The back of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
     * `additional_verification`. Note that `additional_verification` files are [not
     * downloadable](/file-upload#uploading-a-file).
     */
    public var back: InlineLegalEntityCompanyVerificationDocumentBackX113d3925? = null

    /**
     * A user-displayable string describing the verification state of this document.
     */
    public var details: String? = null

    /**
     * One of `document_corrupt`, `document_expired`, `document_failed_copy`, `document_failed_greyscale`,
     * `document_failed_other`, `document_failed_test_mode`, `document_fraudulent`, `document_incomplete`,
     * `document_invalid`, `document_manipulated`, `document_not_readable`, `document_not_uploaded`,
     * `document_type_not_supported`, or `document_too_large`. A machine-readable code specifying the verification state
     * for this document.
     */
    public var detailsCode: String? = null

    /**
     * The front of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
     * `additional_verification`. Note that `additional_verification` files are [not
     * downloadable](/file-upload#uploading-a-file).
     */
    public var front: InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7? = null

    public fun build(): LegalEntityCompanyVerificationDocument = LegalEntityCompanyVerificationDocument(
      back = back,
      details = details,
      detailsCode = detailsCode,
      front = front,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LegalEntityCompanyVerificationDocument = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LegalEntityCompanyVerificationDocument> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegalEntityCompanyVerificationDocument {
      val jsonDecoder = decoder.requireJsonDecoder("LegalEntityCompanyVerificationDocument")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LegalEntityCompanyVerificationDocument must be a JSON object")
      return LegalEntityCompanyVerificationDocument(
        back = rawObject["back"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityCompanyVerificationDocumentBackX113d3925?>(element) },
        details = rawObject["details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        detailsCode = rawObject["details_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        front = rawObject["front"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityCompanyVerificationDocumentFrontXaf6516e7?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegalEntityCompanyVerificationDocument) {
      val jsonEncoder = encoder.requireJsonEncoder("LegalEntityCompanyVerificationDocument")
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

public fun legalEntityCompanyVerificationDocument(block: LegalEntityCompanyVerificationDocument.Builder.() -> Unit): LegalEntityCompanyVerificationDocument = LegalEntityCompanyVerificationDocument.build(block)
