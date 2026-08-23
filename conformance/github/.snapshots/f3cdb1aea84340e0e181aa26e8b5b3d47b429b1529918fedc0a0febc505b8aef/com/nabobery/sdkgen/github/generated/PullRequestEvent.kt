package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-event
 */
@Serializable(with = PullRequestEvent.Serializer::class)
public class PullRequestEvent(
  public val action: String,
  public val number: Int,
  public val pullRequest: PullRequestMinimal,
  public val assignee: SimpleUser? = null,
  assignees: List<SimpleUser>? = null,
  public val label: Label? = null,
  labels: List<Label>? = null,
) {
  public val assignees: List<SimpleUser>? = assignees?.let { collection0 -> collection0.toList() }

  public val labels: List<Label>? = labels?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var actionValue: String? = null

    public var action: String
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var pullRequestValue: PullRequestMinimal? = null

    public var pullRequest: PullRequestMinimal
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    public var assignee: SimpleUser? = null

    private var assigneesValue: List<SimpleUser>? = null

    public var assignees: List<SimpleUser>?
      get() = assigneesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        assigneesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var label: Label? = null

    private var labelsValue: List<Label>? = null

    public var labels: List<Label>?
      get() = labelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        labelsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): PullRequestEvent {
      check(actionValue != null) { "action is required" }
      check(numberValue != null) { "number is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      return PullRequestEvent(
        action = action,
        number = number,
        pullRequest = pullRequest,
        assignee = assignee,
        assignees = assignees,
        label = label,
        labels = labels,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PullRequestEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PullRequestEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PullRequestEvent {
      val jsonDecoder = decoder.requireJsonDecoder("PullRequestEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PullRequestEvent must be a JSON object")
      val action = json.decodeRequired<String>(rawObject, "action")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val pullRequest = json.decodeRequired<PullRequestMinimal>(rawObject, "pull_request")
      return PullRequestEvent(
        action = action,
        number = number,
        pullRequest = pullRequest,
        assignee = rawObject["assignee"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
        assignees = rawObject["assignees"]?.let { json.decodeFromJsonElement<List<SimpleUser>>(it) },
        label = rawObject["label"]?.let { json.decodeFromJsonElement<Label>(it) },
        labels = rawObject["labels"]?.let { json.decodeFromJsonElement<List<Label>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PullRequestEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("PullRequestEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", value.action)
        put("number", json.encodeToJsonElement(value.number))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
        value.assignee?.let { put("assignee", json.encodeToJsonElement(it)) }
        value.assignees?.let { put("assignees", json.encodeToJsonElement(it)) }
        value.label?.let { put("label", json.encodeToJsonElement(it)) }
        value.labels?.let { put("labels", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pullRequestEvent(block: PullRequestEvent.Builder.() -> Unit): PullRequestEvent = PullRequestEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PullRequestEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
