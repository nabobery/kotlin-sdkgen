package io.github.nabobery.sdkgen.github.generated

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
 * Error details for a failed session
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/1/properties/sessions/items/properties/error
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313(
  /**
   * Error message
   */
  public val message: String? = null,
) {
  public class Builder {
    /**
     * Error message
     */
    public var message: String? = null

    public fun build(): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313 = InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313(
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313 must be a JSON object")
      return InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313(
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313(block: InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313 = InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemErrorX951b0313.build(block)
