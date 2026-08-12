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
 * Details on the legal guardian's or authorizer's acceptance of the required Stripe agreements.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/additional_tos_acceptances
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5(
  public val account:
      InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX9d3c3571? = null,
) {
  public class Builder {
    public var account:
        InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX9d3c3571? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5 = InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5(
      account = account,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5 must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5(
        account = rawObject["account"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAccountX9d3c3571>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.account?.let { put("account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5(block: InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5 = InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesXdcdc20f5.build(block)
