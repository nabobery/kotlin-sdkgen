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
 * Source: sdkgen://source/openapi.json#/components/schemas/account_unification_account_controller_fees
 */
@Serializable(with = AccountUnificationAccountControllerFees.Serializer::class)
public class AccountUnificationAccountControllerFees(
  /**
   * A value indicating the responsible payer of a bundle of Stripe fees for pricing-control eligible products on this
   * account. Learn more about [fee behavior on connected
   * accounts](https://docs.stripe.com/connect/direct-charges-fee-payer-behavior).
   */
  public val payer: InlineAccountUnificationAccountControllerFeesPayerXf588ffe2,
) {
  public class Builder {
    private var payerValue: InlineAccountUnificationAccountControllerFeesPayerXf588ffe2? = null

    public var payer: InlineAccountUnificationAccountControllerFeesPayerXf588ffe2
      get() = requireNotNull(payerValue) { "payer is required" }
      set(`value`) {
        payerValue = value
      }

    public fun build(): AccountUnificationAccountControllerFees {
      check(payerValue != null) { "payer is required" }
      return AccountUnificationAccountControllerFees(
        payer = payer,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountUnificationAccountControllerFees = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountUnificationAccountControllerFees> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountUnificationAccountControllerFees {
      val jsonDecoder = decoder.requireJsonDecoder("AccountUnificationAccountControllerFees")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountUnificationAccountControllerFees must be a JSON object")
      val payer = json.decodeRequired<InlineAccountUnificationAccountControllerFeesPayerXf588ffe2>(rawObject, "payer")
      return AccountUnificationAccountControllerFees(
        payer = payer,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountUnificationAccountControllerFees) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountUnificationAccountControllerFees")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payer", json.encodeToJsonElement(value.payer))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountUnificationAccountControllerFees(block: AccountUnificationAccountControllerFees.Builder.() -> Unit): AccountUnificationAccountControllerFees = AccountUnificationAccountControllerFees.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AccountUnificationAccountControllerFees is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
