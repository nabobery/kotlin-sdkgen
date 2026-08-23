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
 * roperties/person/properties/additional_tos_acceptances.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/additional_tos_acceptances
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f.Serializer::class)
public class InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f(
  public val account:
      InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2? = null,
) {
  public class Builder {
    public var account: InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2?
        = null

    public fun build(): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f = InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f(
      account = account,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f must be a JSON object")
      return InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f(
        account = rawObject["account"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.account?.let { put("account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f(block: InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f.Builder.() -> Unit): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f = InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f.build(block)
