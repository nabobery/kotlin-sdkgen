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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/1/pro
 * perties/steps/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress/properties/workflow_job/allOf/1/pro
 * perties/steps/items
 */
@Serializable(with = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0.Serializer::class)
public class InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0(
  public val completedAt: String?,
  public val conclusion: String?,
  public val name: String,
  public val number: Int,
  public val startedAt: String?,
  public val status: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346,
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
        InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346? = null

    public var status: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346
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

    private var conclusionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: String?
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

    public fun build(): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0 {
      check(nameValue != null) { "name is required" }
      check(numberValue != null) { "number is required" }
      check(statusValue != null) { "status is required" }
      check(completedAtState !== FieldState.Absent) { "completedAt is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(startedAtState !== FieldState.Absent) { "startedAt is required, even when null" }
      return InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val status = json.decodeRequired<InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemStatusXbfae0346>(rawObject, "status")
      if (!rawObject.containsKey("completed_at")) {
        throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0 is missing required property 'completed_at'")
      }
      val completedAt = rawObject["completed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0 is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("started_at")) {
        throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0 is missing required property 'started_at'")
      }
      val startedAt = rawObject["started_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0(
        completedAt = completedAt,
        conclusion = conclusion,
        name = name,
        number = number,
        startedAt = startedAt,
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0")
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

public fun inlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0(block: InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0.Builder.() -> Unit): InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0 = InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookWorkflowJobInProgressWorkflowJobAllOf2StepsItemX34ccbea0 property '" + name + "' is not nullable")
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
