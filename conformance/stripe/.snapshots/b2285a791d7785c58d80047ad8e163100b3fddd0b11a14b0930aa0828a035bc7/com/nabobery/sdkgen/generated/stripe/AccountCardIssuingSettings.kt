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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_card_issuing_settings
 */
@Serializable(with = AccountCardIssuingSettings.Serializer::class)
public class AccountCardIssuingSettings(
  public val tosAcceptance: CardIssuingAccountTermsOfService? = null,
) {
  public class Builder {
    public var tosAcceptance: CardIssuingAccountTermsOfService? = null

    public fun build(): AccountCardIssuingSettings = AccountCardIssuingSettings(
      tosAcceptance = tosAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountCardIssuingSettings = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AccountCardIssuingSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountCardIssuingSettings {
      val jsonDecoder = decoder.requireJsonDecoder("AccountCardIssuingSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountCardIssuingSettings must be a JSON object")
      return AccountCardIssuingSettings(
        tosAcceptance = rawObject["tos_acceptance"]?.let { json.decodeFromJsonElement<CardIssuingAccountTermsOfService>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountCardIssuingSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountCardIssuingSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tosAcceptance?.let { put("tos_acceptance", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountCardIssuingSettings(block: AccountCardIssuingSettings.Builder.() -> Unit): AccountCardIssuingSettings = AccountCardIssuingSettings.build(block)
