package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/IncompleteDetails.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/IncompleteDetails
 */
@Serializable(with = IncompleteDetails.Serializer::class)
public class IncompleteDetails(
  public val reason: InlineIncompleteDetailsReasonXa92e2778? = null,
) {
  public class Builder {
    public var reason: InlineIncompleteDetailsReasonXa92e2778? = null

    public fun build(): IncompleteDetails = IncompleteDetails(
      reason = reason,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IncompleteDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IncompleteDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IncompleteDetails {
      val jsonDecoder = decoder.requireJsonDecoder("IncompleteDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IncompleteDetails must be a JSON object")
      return IncompleteDetails(
        reason = rawObject["reason"]?.let { json.decodeFromJsonElement<InlineIncompleteDetailsReasonXa92e2778>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IncompleteDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("IncompleteDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun incompleteDetails(block: IncompleteDetails.Builder.() -> Unit): IncompleteDetails = IncompleteDetails.build(block)
