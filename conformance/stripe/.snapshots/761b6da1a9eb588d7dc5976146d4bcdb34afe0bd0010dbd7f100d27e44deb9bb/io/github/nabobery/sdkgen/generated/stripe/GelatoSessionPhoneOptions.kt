package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_session_phone_options
 */
@Serializable(with = GelatoSessionPhoneOptions.Serializer::class)
public class GelatoSessionPhoneOptions(
  /**
   * Request one time password verification of `provided_details.phone`.
   */
  public val requireVerification: Boolean? = null,
) {
  public class Builder {
    /**
     * Request one time password verification of `provided_details.phone`.
     */
    public var requireVerification: Boolean? = null

    public fun build(): GelatoSessionPhoneOptions = GelatoSessionPhoneOptions(
      requireVerification = requireVerification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoSessionPhoneOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GelatoSessionPhoneOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoSessionPhoneOptions {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoSessionPhoneOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoSessionPhoneOptions must be a JSON object")
      return GelatoSessionPhoneOptions(
        requireVerification = rawObject["require_verification"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoSessionPhoneOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoSessionPhoneOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requireVerification?.let { put("require_verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoSessionPhoneOptions(block: GelatoSessionPhoneOptions.Builder.() -> Unit): GelatoSessionPhoneOptions = GelatoSessionPhoneOptions.build(block)
