package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/verification.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company/properties/verification
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec.Serializer::class)
public class InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec(
  public val document:
      InlineV1TokensPostRequestFormAccountCompanyVerificationDocumentX0029b911? = null,
) {
  public class Builder {
    public var document: InlineV1TokensPostRequestFormAccountCompanyVerificationDocumentX0029b911? =
        null

    public fun build(): InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec = InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec(
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec must be a JSON object")
      return InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec(
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyVerificationDocumentX0029b911>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec(block: InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec.Builder.() -> Unit): InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec = InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec.build(block)
