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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class GelatoProvidedDetailsView(
  public val email: String? = null,
  public val phone: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_provided_details
 */
@Serializable(with = GelatoProvidedDetails.Serializer::class)
public class GelatoProvidedDetails(
  /**
   * Email of user being verified
   */
  public val email: String? = null,
  /**
   * Phone number of user being verified
   */
  public val phone: String? = null,
) {
  public class Builder {
    /**
     * Email of user being verified
     */
    public var email: String? = null

    /**
     * Phone number of user being verified
     */
    public var phone: String? = null

    public fun build(): GelatoProvidedDetails = GelatoProvidedDetails(
      email = email,
      phone = phone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoProvidedDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GelatoProvidedDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoProvidedDetails {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoProvidedDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoProvidedDetails must be a JSON object")
      return GelatoProvidedDetails(
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoProvidedDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoProvidedDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.email?.let { put("email", it) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoProvidedDetails(block: GelatoProvidedDetails.Builder.() -> Unit): GelatoProvidedDetails = GelatoProvidedDetails.build(block)
