package com.nabobery.sdkgen.github.generated

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

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1content_exclusion/put/responses/200/content/application~1
 * json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1content_exclusion/put/responses/200/content/application~1
 * json/schema
 */
@Serializable(with = InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878.Serializer::class)
public class InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878(
  public val message: String? = null,
) {
  public class Builder {
    public var message: String? = null

    public fun build(): InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878 = InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878(
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878 must be a JSON object")
      return InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878(
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878(block: InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878.Builder.() -> Unit): InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878 = InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878.build(block)
