package io.github.nabobery.sdkgen.generated

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

/**
 * Configuration for controlling output behavior. Supports the effort parameter and structured output format.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesOutputConfig
 */
@Serializable(with = MessagesOutputConfig.Serializer::class)
public class MessagesOutputConfig(
  /**
   * How much effort the model should put into its response. Higher effort levels may result in more thorough analysis
   * but take longer. Valid values are `low`, `medium`, `high`, `xhigh`, or `max`.
   */
  public val effort: InlineMessagesOutputConfigEffortX4bff4ae3? = null,
  /**
   * A schema to specify Claude's output format in responses. See [structured
   * outputs](https://platform.claude.com/docs/en/build-with-claude/structured-outputs).
   */
  public val format: InlineMessagesOutputConfigFormatX27ce9294? = null,
  /**
   * Task budget for an agentic turn. The model sees a countdown of remaining tokens and uses it to prioritize work and
   * wind down gracefully. Advisory — does not enforce a hard cap.
   */
  public val taskBudget: InlineMessagesOutputConfigTaskBudgetXc667201a? = null,
) {
  public class Builder {
    /**
     * How much effort the model should put into its response. Higher effort levels may result in more thorough analysis
     * but take longer. Valid values are `low`, `medium`, `high`, `xhigh`, or `max`.
     */
    public var effort: InlineMessagesOutputConfigEffortX4bff4ae3? = null

    /**
     * A schema to specify Claude's output format in responses. See [structured
     * outputs](https://platform.claude.com/docs/en/build-with-claude/structured-outputs).
     */
    public var format: InlineMessagesOutputConfigFormatX27ce9294? = null

    /**
     * Task budget for an agentic turn. The model sees a countdown of remaining tokens and uses it to prioritize work
     * and wind down gracefully. Advisory — does not enforce a hard cap.
     */
    public var taskBudget: InlineMessagesOutputConfigTaskBudgetXc667201a? = null

    public fun build(): MessagesOutputConfig = MessagesOutputConfig(
      effort = effort,
      format = format,
      taskBudget = taskBudget,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesOutputConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesOutputConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesOutputConfig {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesOutputConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesOutputConfig must be a JSON object")
      return MessagesOutputConfig(
        effort = rawObject["effort"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineMessagesOutputConfigEffortX4bff4ae3?>(element) },
        format = rawObject["format"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineMessagesOutputConfigFormatX27ce9294?>(element) },
        taskBudget = rawObject["task_budget"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineMessagesOutputConfigTaskBudgetXc667201a?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesOutputConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesOutputConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.effort?.let { put("effort", json.encodeToJsonElement(it)) }
        value.format?.let { put("format", json.encodeToJsonElement(it)) }
        value.taskBudget?.let { put("task_budget", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesOutputConfig(block: MessagesOutputConfig.Builder.() -> Unit): MessagesOutputConfig = MessagesOutputConfig.build(block)
