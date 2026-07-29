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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/additional_tos_acceptances
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2(
  public val account:
      InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6? = null,
) {
  public class Builder {
    public var account:
        InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6? = null

    public fun build(): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2 = InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2(
      account = account,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2 must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2(
        account = rawObject["account"]?.let { json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.account?.let { put("account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2(block: InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2 = InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesX427f04c2.build(block)
