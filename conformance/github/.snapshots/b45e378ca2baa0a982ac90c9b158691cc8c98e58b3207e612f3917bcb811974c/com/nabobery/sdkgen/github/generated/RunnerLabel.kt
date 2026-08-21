package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A label for a self hosted runner
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/runner-label
 */
@Serializable(with = RunnerLabel.Serializer::class)
public class RunnerLabel(
  /**
   * Name of the label.
   */
  public val name: String,
  /**
   * Unique identifier of the label.
   */
  public val id: Int? = null,
  /**
   * The type of label. Read-only labels are applied automatically when the runner is configured.
   */
  public val type: InlineRunnerLabelTypeXef10c31c? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Unique identifier of the label.
     */
    public var id: Int? = null

    /**
     * The type of label. Read-only labels are applied automatically when the runner is configured.
     */
    public var type: InlineRunnerLabelTypeXef10c31c? = null

    public fun build(): RunnerLabel {
      check(nameValue != null) { "name is required" }
      return RunnerLabel(
        name = name,
        id = id,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RunnerLabel = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RunnerLabel> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RunnerLabel {
      val jsonDecoder = decoder.requireJsonDecoder("RunnerLabel")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RunnerLabel must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return RunnerLabel(
        name = name,
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineRunnerLabelTypeXef10c31c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RunnerLabel) {
      val jsonEncoder = encoder.requireJsonEncoder("RunnerLabel")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun runnerLabel(block: RunnerLabel.Builder.() -> Unit): RunnerLabel = RunnerLabel.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RunnerLabel is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
