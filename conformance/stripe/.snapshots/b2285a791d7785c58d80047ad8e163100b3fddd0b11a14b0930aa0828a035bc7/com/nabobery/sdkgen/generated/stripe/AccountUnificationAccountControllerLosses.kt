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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_unification_account_controller_losses
 */
@Serializable(with = AccountUnificationAccountControllerLosses.Serializer::class)
public class AccountUnificationAccountControllerLosses(
  /**
   * A value indicating who is liable when this account can't pay back negative balances from payments.
   */
  public val payments: InlineAccountUnificationAccountControllerLossesPaymentsX6a854391,
) {
  public class Builder {
    private var paymentsValue: InlineAccountUnificationAccountControllerLossesPaymentsX6a854391? =
        null

    public var payments: InlineAccountUnificationAccountControllerLossesPaymentsX6a854391
      get() = requireNotNull(paymentsValue) { "payments is required" }
      set(`value`) {
        paymentsValue = value
      }

    public fun build(): AccountUnificationAccountControllerLosses {
      check(paymentsValue != null) { "payments is required" }
      return AccountUnificationAccountControllerLosses(
        payments = payments,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountUnificationAccountControllerLosses = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AccountUnificationAccountControllerLosses> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountUnificationAccountControllerLosses {
      val jsonDecoder = decoder.requireJsonDecoder("AccountUnificationAccountControllerLosses")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountUnificationAccountControllerLosses must be a JSON object")
      val payments = json.decodeRequired<InlineAccountUnificationAccountControllerLossesPaymentsX6a854391>(rawObject, "payments")
      return AccountUnificationAccountControllerLosses(
        payments = payments,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountUnificationAccountControllerLosses) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountUnificationAccountControllerLosses")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payments", json.encodeToJsonElement(value.payments))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountUnificationAccountControllerLosses(block: AccountUnificationAccountControllerLosses.Builder.() -> Unit): AccountUnificationAccountControllerLosses = AccountUnificationAccountControllerLosses.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AccountUnificationAccountControllerLosses is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
