package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class KlarnaPayerDetailsView(
  public val address: InlineKlarnaPayerDetailsAddressXf6d978be? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/klarna_payer_details
 */
@Serializable(with = KlarnaPayerDetails.Serializer::class)
public class KlarnaPayerDetails(
  /**
   * The payer's address
   */
  public val address: InlineKlarnaPayerDetailsAddressXf6d978be? = null,
) {
  public class Builder {
    /**
     * The payer's address
     */
    public var address: InlineKlarnaPayerDetailsAddressXf6d978be? = null

    public fun build(): KlarnaPayerDetails = KlarnaPayerDetails(
      address = address,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): KlarnaPayerDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<KlarnaPayerDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): KlarnaPayerDetails {
      val jsonDecoder = decoder.requireJsonDecoder("KlarnaPayerDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("KlarnaPayerDetails must be a JSON object")
      return KlarnaPayerDetails(
        address = rawObject["address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineKlarnaPayerDetailsAddressXf6d978be?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: KlarnaPayerDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("KlarnaPayerDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun klarnaPayerDetails(block: KlarnaPayerDetails.Builder.() -> Unit): KlarnaPayerDetails = KlarnaPayerDetails.build(block)
