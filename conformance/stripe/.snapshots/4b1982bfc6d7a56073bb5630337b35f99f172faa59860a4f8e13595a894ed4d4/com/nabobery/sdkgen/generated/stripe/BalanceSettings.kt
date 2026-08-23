package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Options for customizing account balances and payout settings for a Stripe platform’s connected accounts.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings
 */
@Serializable(with = BalanceSettings.Serializer::class)
public class BalanceSettings(
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineBalanceSettingsObjectValueX0b9d1564,
  public val payments: BalanceSettingsResourcePayments,
) {
  public class Builder {
    private var objectValueValue: InlineBalanceSettingsObjectValueX0b9d1564? = null

    public var objectValue: InlineBalanceSettingsObjectValueX0b9d1564
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var paymentsValue: BalanceSettingsResourcePayments? = null

    public var payments: BalanceSettingsResourcePayments
      get() = requireNotNull(paymentsValue) { "payments is required" }
      set(`value`) {
        paymentsValue = value
      }

    public fun build(): BalanceSettings {
      check(objectValueValue != null) { "objectValue is required" }
      check(paymentsValue != null) { "payments is required" }
      return BalanceSettings(
        objectValue = objectValue,
        payments = payments,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BalanceSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BalanceSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BalanceSettings {
      val jsonDecoder = decoder.requireJsonDecoder("BalanceSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BalanceSettings must be a JSON object")
      val objectValue = json.decodeRequired<InlineBalanceSettingsObjectValueX0b9d1564>(rawObject, "object")
      val payments = json.decodeRequired<BalanceSettingsResourcePayments>(rawObject, "payments")
      return BalanceSettings(
        objectValue = objectValue,
        payments = payments,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BalanceSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("BalanceSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("object", json.encodeToJsonElement(value.objectValue))
        put("payments", json.encodeToJsonElement(value.payments))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun balanceSettings(block: BalanceSettings.Builder.() -> Unit): BalanceSettings = BalanceSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BalanceSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
