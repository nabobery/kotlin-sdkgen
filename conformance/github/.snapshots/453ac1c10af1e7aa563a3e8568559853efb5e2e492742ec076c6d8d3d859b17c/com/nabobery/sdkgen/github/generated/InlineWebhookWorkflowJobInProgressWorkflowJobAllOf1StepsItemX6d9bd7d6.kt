package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/0/pro
 * perties/steps/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/0/pro
 * perties/steps/items
 */
@Serializable(with = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6.Serializer::class)
public class InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6(
  public val completedAt: String?,
  public val conclusion:
      InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1?,
  public val name: String,
  public val number: Int,
  public val startedAt: String?,
  public val status: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var statusValue:
        InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7? = null

    public var status: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var completedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var completedAt: String?
      get() = completedAtState.valueOrNull()
      set(`value`) {
        completedAtState = value.toNullableFieldState()
      }

    private var conclusionState:
        FieldState<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1?>
        = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion:
        InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1?
      get() = conclusionState.valueOrNull()
      set(`value`) {
        conclusionState = value.toNullableFieldState()
      }

    private var startedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var startedAt: String?
      get() = startedAtState.valueOrNull()
      set(`value`) {
        startedAtState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6 {
      check(nameValue != null) { "name is required" }
      check(numberValue != null) { "number is required" }
      check(statusValue != null) { "status is required" }
      check(completedAtState !== FieldState.Absent) { "completedAt is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(startedAtState !== FieldState.Absent) { "startedAt is required, even when null" }
      return InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6(
        completedAt = completedAtState.valueOrNull(),
        conclusion = conclusionState.valueOrNull(),
        name = name,
        number = number,
        startedAt = startedAtState.valueOrNull(),
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val status = json.decodeRequired<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemStatusX6ddfcff7>(rawObject, "status")
      if (!rawObject.containsKey("completed_at")) {
        throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6 is missing required property 'completed_at'")
      }
      val completedAt = rawObject["completed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6 is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemConclusionXcb120ef1?>(requireNotNull(element)) }
      if (!rawObject.containsKey("started_at")) {
        throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6 is missing required property 'started_at'")
      }
      val startedAt = rawObject["started_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6(
        completedAt = completedAt,
        conclusion = conclusion,
        name = name,
        number = number,
        startedAt = startedAt,
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completed_at", value.completedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name)
        put("number", json.encodeToJsonElement(value.number))
        put("started_at", value.startedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("status", json.encodeToJsonElement(value.status))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6(block: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6.Builder.() -> Unit): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6 = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf1StepsItemX6d9bd7d6 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
