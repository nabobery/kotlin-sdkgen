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
 * Source: sdkgen://source/openapi.json#/components/schemas/account_treasury_settings
 */
@Serializable(with = AccountTreasurySettings.Serializer::class)
public class AccountTreasurySettings(
  public val tosAcceptance: AccountTermsOfService? = null,
) {
  public class Builder {
    public var tosAcceptance: AccountTermsOfService? = null

    public fun build(): AccountTreasurySettings = AccountTreasurySettings(
      tosAcceptance = tosAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountTreasurySettings = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AccountTreasurySettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountTreasurySettings {
      val jsonDecoder = decoder.requireJsonDecoder("AccountTreasurySettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountTreasurySettings must be a JSON object")
      return AccountTreasurySettings(
        tosAcceptance = rawObject["tos_acceptance"]?.let { json.decodeFromJsonElement<AccountTermsOfService>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountTreasurySettings) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountTreasurySettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.tosAcceptance?.let { put("tos_acceptance", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountTreasurySettings(block: AccountTreasurySettings.Builder.() -> Unit): AccountTreasurySettings = AccountTreasurySettings.build(block)
