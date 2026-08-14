package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/company/properties/verification/properties/document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/company/properties/verification/properties/document
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd.Serializer::class)
public class InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd(
  public val back: String? = null,
  public val front: String? = null,
) {
  public class Builder {
    public var back: String? = null

    public var front: String? = null

    public fun build(): InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd = InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd(
      back = back,
      front = front,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd must be a JSON object")
      return InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd(
        back = rawObject["back"]?.let { json.decodeFromJsonElement<String>(it) },
        front = rawObject["front"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.back?.let { put("back", it) }
        value.front?.let { put("front", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd(block: InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd.Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd = InlineV1AccountsPostRequestFormCompanyVerificationDocumentX2af09bbd.build(block)
