package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1tasks~1{task_id}/get/responses/200/content/application~1json/schema/all
 * Of/1
 */
@Serializable(with = InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581.Serializer::class)
public class InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581(
  sessions: List<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4>? = null,
) {
  /**
   * Sessions associated with this task
   */
  public val sessions: List<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4>? =
      sessions?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var sessionsValue: List<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4>?
        = null

    /**
     * Sessions associated with this task
     */
    public var sessions: List<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4>?
      get() = sessionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        sessionsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581 = InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581(
      sessions = sessions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581 must be a JSON object")
      return InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581(
        sessions = rawObject["sessions"]?.let { json.decodeFromJsonElement<List<InlineAgentsTasksGetResponse200JsonAllOf2SessionsItemX1ab1b6d4>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.sessions?.let { put("sessions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581(block: InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581.Builder.() -> Unit): InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581 = InlineAgentsTasksGetResponse200JsonAllOf2Xd13fa581.build(block)
