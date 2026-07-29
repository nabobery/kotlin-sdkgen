package com.nabobery.sdkgen.generated.stripe

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

@Serializable
public data class IssuingCardholderIdDocumentView(
  public val back: InlineIssuingCardholderIdDocumentBackX7c37f4b6? = null,
  public val front: InlineIssuingCardholderIdDocumentFrontXae327429? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_id_document
 */
@Serializable(with = IssuingCardholderIdDocument.Serializer::class)
public class IssuingCardholderIdDocument(
  /**
   * The back of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
   * `identity_document`.
   */
  public val back: InlineIssuingCardholderIdDocumentBackX7c37f4b6? = null,
  /**
   * The front of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
   * `identity_document`.
   */
  public val front: InlineIssuingCardholderIdDocumentFrontXae327429? = null,
) {
  public class Builder {
    /**
     * The back of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
     * `identity_document`.
     */
    public var back: InlineIssuingCardholderIdDocumentBackX7c37f4b6? = null

    /**
     * The front of a document returned by a [file upload](https://api.stripe.com#create_file) with a `purpose` value of
     * `identity_document`.
     */
    public var front: InlineIssuingCardholderIdDocumentFrontXae327429? = null

    public fun build(): IssuingCardholderIdDocument = IssuingCardholderIdDocument(
      back = back,
      front = front,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardholderIdDocument = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingCardholderIdDocument> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardholderIdDocument {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholderIdDocument")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardholderIdDocument must be a JSON object")
      return IssuingCardholderIdDocument(
        back = rawObject["back"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardholderIdDocumentBackX7c37f4b6?>(element) },
        front = rawObject["front"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardholderIdDocumentFrontXae327429?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardholderIdDocument) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholderIdDocument")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.back?.let { put("back", json.encodeToJsonElement(it)) }
        value.front?.let { put("front", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardholderIdDocument(block: IssuingCardholderIdDocument.Builder.() -> Unit): IssuingCardholderIdDocument = IssuingCardholderIdDocument.build(block)
