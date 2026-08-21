package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Source: sdkgen://source/openapi.json#/components/schemas/account_decline_charge_on
 */
@Serializable(with = AccountDeclineChargeOn.Serializer::class)
public class AccountDeclineChargeOn(
  /**
   * Whether Stripe automatically declines charges with an incorrect ZIP or postal code. This setting only applies when
   * a ZIP or postal code is provided and they fail bank verification.
   */
  public val avsFailure: Boolean,
  /**
   * Whether Stripe automatically declines charges with an incorrect CVC. This setting only applies when a CVC is
   * provided and it fails bank verification.
   */
  public val cvcFailure: Boolean,
) {
  public class Builder {
    private var avsFailureValue: Boolean? = null

    public var avsFailure: Boolean
      get() = requireNotNull(avsFailureValue) { "avsFailure is required" }
      set(`value`) {
        avsFailureValue = value
      }

    private var cvcFailureValue: Boolean? = null

    public var cvcFailure: Boolean
      get() = requireNotNull(cvcFailureValue) { "cvcFailure is required" }
      set(`value`) {
        cvcFailureValue = value
      }

    public fun build(): AccountDeclineChargeOn {
      check(avsFailureValue != null) { "avsFailure is required" }
      check(cvcFailureValue != null) { "cvcFailure is required" }
      return AccountDeclineChargeOn(
        avsFailure = avsFailure,
        cvcFailure = cvcFailure,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountDeclineChargeOn = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountDeclineChargeOn> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountDeclineChargeOn {
      val jsonDecoder = decoder.requireJsonDecoder("AccountDeclineChargeOn")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountDeclineChargeOn must be a JSON object")
      val avsFailure = json.decodeRequired<Boolean>(rawObject, "avs_failure")
      val cvcFailure = json.decodeRequired<Boolean>(rawObject, "cvc_failure")
      return AccountDeclineChargeOn(
        avsFailure = avsFailure,
        cvcFailure = cvcFailure,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountDeclineChargeOn) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountDeclineChargeOn")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avs_failure", json.encodeToJsonElement(value.avsFailure))
        put("cvc_failure", json.encodeToJsonElement(value.cvcFailure))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountDeclineChargeOn(block: AccountDeclineChargeOn.Builder.() -> Unit): AccountDeclineChargeOn = AccountDeclineChargeOn.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AccountDeclineChargeOn is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
