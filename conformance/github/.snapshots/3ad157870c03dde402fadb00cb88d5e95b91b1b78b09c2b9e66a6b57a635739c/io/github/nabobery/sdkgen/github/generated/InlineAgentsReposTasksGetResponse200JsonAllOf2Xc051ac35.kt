package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1agents~1repos~1{owner}~1{repo}~1tasks~1{task_id}/get/responses/200/content/appl
 * ication~1json/schema/allOf/1
 */
@Serializable(with = InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35.Serializer::class)
public class InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35(
  sessions: List<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980>? = null,
) {
  /**
   * Sessions associated with this task
   */
  public val sessions: List<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980>? =
      sessions?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var sessionsValue:
        List<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980>? = null

    /**
     * Sessions associated with this task
     */
    public var sessions: List<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980>?
      get() = sessionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        sessionsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35 = InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35(
      sessions = sessions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35 must be a JSON object")
      return InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35(
        sessions = rawObject["sessions"]?.let { json.decodeFromJsonElement<List<InlineAgentsReposTasksGetResponse200JsonAllOf2SessionsItemX01987980>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.sessions?.let { put("sessions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35(block: InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35.Builder.() -> Unit): InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35 = InlineAgentsReposTasksGetResponse200JsonAllOf2Xc051ac35.build(block)
