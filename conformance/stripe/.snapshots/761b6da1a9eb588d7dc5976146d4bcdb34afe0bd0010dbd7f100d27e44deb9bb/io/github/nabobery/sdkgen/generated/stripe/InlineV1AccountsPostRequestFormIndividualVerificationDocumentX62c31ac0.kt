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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/verification/properties/document.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/verification/properties/document
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0(
  public val back: String? = null,
  public val front: String? = null,
) {
  public class Builder {
    public var back: String? = null

    public var front: String? = null

    public fun build(): InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0 = InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0(
      back = back,
      front = front,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0 must be a JSON object")
      return InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0(
        back = rawObject["back"]?.let { json.decodeFromJsonElement<String>(it) },
        front = rawObject["front"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.back?.let { put("back", it) }
        value.front?.let { put("front", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0(block: InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0.Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0 = InlineV1AccountsPostRequestFormIndividualVerificationDocumentX62c31ac0.build(block)
