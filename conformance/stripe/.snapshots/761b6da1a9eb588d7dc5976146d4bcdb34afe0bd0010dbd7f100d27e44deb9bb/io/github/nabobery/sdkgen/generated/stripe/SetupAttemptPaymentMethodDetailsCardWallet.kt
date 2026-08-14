package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class SetupAttemptPaymentMethodDetailsCardWalletView(
  @SerialName("apple_pay")
  public val applePay: JsonObject? = null,
  @SerialName("google_pay")
  public val googlePay: JsonObject? = null,
  public val type: InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_card_wallet
 */
@Serializable(with = SetupAttemptPaymentMethodDetailsCardWallet.Serializer::class)
public class SetupAttemptPaymentMethodDetailsCardWallet(
  /**
   * The type of the card wallet, one of `apple_pay`, `google_pay`, or `link`. An additional hash is included on the
   * Wallet subhash with a name matching this value. It contains additional information specific to the card wallet
   * type.
   */
  public val type: InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e,
  public val applePay: JsonObject? = null,
  public val googlePay: JsonObject? = null,
) {
  public class Builder {
    private var typeValue: InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e? = null

    public var type: InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var applePay: JsonObject? = null

    public var googlePay: JsonObject? = null

    public fun build(): SetupAttemptPaymentMethodDetailsCardWallet {
      check(typeValue != null) { "type is required" }
      return SetupAttemptPaymentMethodDetailsCardWallet(
        type = type,
        applePay = applePay,
        googlePay = googlePay,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupAttemptPaymentMethodDetailsCardWallet = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupAttemptPaymentMethodDetailsCardWallet> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupAttemptPaymentMethodDetailsCardWallet {
      val jsonDecoder = decoder.requireJsonDecoder("SetupAttemptPaymentMethodDetailsCardWallet")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupAttemptPaymentMethodDetailsCardWallet must be a JSON object")
      val type = json.decodeRequired<InlineSetupAttemptPaymentMethodDetailsCardWalletTypeX01f38d3e>(rawObject, "type")
      return SetupAttemptPaymentMethodDetailsCardWallet(
        type = type,
        applePay = rawObject["apple_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        googlePay = rawObject["google_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupAttemptPaymentMethodDetailsCardWallet) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupAttemptPaymentMethodDetailsCardWallet")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.applePay?.let { put("apple_pay", json.encodeToJsonElement(it)) }
        value.googlePay?.let { put("google_pay", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupAttemptPaymentMethodDetailsCardWallet(block: SetupAttemptPaymentMethodDetailsCardWallet.Builder.() -> Unit): SetupAttemptPaymentMethodDetailsCardWallet = SetupAttemptPaymentMethodDetailsCardWallet.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SetupAttemptPaymentMethodDetailsCardWallet is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
