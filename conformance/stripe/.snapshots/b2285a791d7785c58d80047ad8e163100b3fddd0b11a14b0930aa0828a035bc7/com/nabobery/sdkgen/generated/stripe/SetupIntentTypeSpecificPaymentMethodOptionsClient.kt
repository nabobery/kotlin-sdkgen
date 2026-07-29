package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class SetupIntentTypeSpecificPaymentMethodOptionsClientView(
  @SerialName("mandate_options")
  public val mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsPayto? = null,
  @SerialName("verification_method")
  public val verificationMethod: InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_type_specific_payment_method_options_client
 */
@Serializable(with = SetupIntentTypeSpecificPaymentMethodOptionsClient.Serializer::class)
public class SetupIntentTypeSpecificPaymentMethodOptionsClient(
  public val mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsPayto? = null,
  /**
   * Bank account verification method. The default value is `automatic`.
   */
  public val verificationMethod: InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe? = null,
) {
  public class Builder {
    public var mandateOptions: SetupIntentPaymentMethodOptionsMandateOptionsPayto? = null

    /**
     * Bank account verification method. The default value is `automatic`.
     */
    public var verificationMethod: InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe? = null

    public fun build(): SetupIntentTypeSpecificPaymentMethodOptionsClient = SetupIntentTypeSpecificPaymentMethodOptionsClient(
      mandateOptions = mandateOptions,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupIntentTypeSpecificPaymentMethodOptionsClient = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SetupIntentTypeSpecificPaymentMethodOptionsClient> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupIntentTypeSpecificPaymentMethodOptionsClient {
      val jsonDecoder = decoder.requireJsonDecoder("SetupIntentTypeSpecificPaymentMethodOptionsClient")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupIntentTypeSpecificPaymentMethodOptionsClient must be a JSON object")
      return SetupIntentTypeSpecificPaymentMethodOptionsClient(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsMandateOptionsPayto>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineSetupIntentTypeSpeci142bVerificationMethodX806b0bbe>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupIntentTypeSpecificPaymentMethodOptionsClient) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupIntentTypeSpecificPaymentMethodOptionsClient")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupIntentTypeSpecificPaymentMethodOptionsClient(block: SetupIntentTypeSpecificPaymentMethodOptionsClient.Builder.() -> Unit): SetupIntentTypeSpecificPaymentMethodOptionsClient = SetupIntentTypeSpecificPaymentMethodOptionsClient.build(block)
