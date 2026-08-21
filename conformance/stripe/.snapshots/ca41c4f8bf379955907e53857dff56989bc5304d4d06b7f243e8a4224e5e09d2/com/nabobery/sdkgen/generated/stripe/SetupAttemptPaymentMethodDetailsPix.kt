package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_pix
 */
@Serializable(with = SetupAttemptPaymentMethodDetailsPix.Serializer::class)
public class SetupAttemptPaymentMethodDetailsPix(
  /**
   * Uniquely identifies this particular Pix account. You can use this attribute to check whether two Pix accounts are
   * the same.
   */
  public val fingerprint: String? = null,
) {
  public class Builder {
    /**
     * Uniquely identifies this particular Pix account. You can use this attribute to check whether two Pix accounts are
     * the same.
     */
    public var fingerprint: String? = null

    public fun build(): SetupAttemptPaymentMethodDetailsPix = SetupAttemptPaymentMethodDetailsPix(
      fingerprint = fingerprint,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupAttemptPaymentMethodDetailsPix = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupAttemptPaymentMethodDetailsPix> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupAttemptPaymentMethodDetailsPix {
      val jsonDecoder = decoder.requireJsonDecoder("SetupAttemptPaymentMethodDetailsPix")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupAttemptPaymentMethodDetailsPix must be a JSON object")
      return SetupAttemptPaymentMethodDetailsPix(
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupAttemptPaymentMethodDetailsPix) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupAttemptPaymentMethodDetailsPix")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fingerprint?.let { put("fingerprint", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupAttemptPaymentMethodDetailsPix(block: SetupAttemptPaymentMethodDetailsPix.Builder.() -> Unit): SetupAttemptPaymentMethodDetailsPix = SetupAttemptPaymentMethodDetailsPix.build(block)
