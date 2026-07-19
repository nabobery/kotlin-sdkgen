package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = MessagesOutputConfig.Serializer::class)
public class MessagesOutputConfig(
  /**
   * How much effort the model should put into its response. Higher effort levels may result in more thorough analysis
   * but take longer. Valid values are `low`, `medium`, `high`, `xhigh`, or `max`.
   */
  public val effort: InlineComponentsSchemasMessagesOutputConfigPropertiesEffort? = null,
  /**
   * A schema to specify Claude's output format in responses. See [structured
   * outputs](https://platform.claude.com/docs/en/build-with-claude/structured-outputs).
   */
  public val format: InlineComponentsSchemasMessagesOutputConfigPropertiesFormat? = null,
  /**
   * Task budget for an agentic turn. The model sees a countdown of remaining tokens and uses it to prioritize work and
   * wind down gracefully. Advisory — does not enforce a hard cap.
   */
  public val taskBudget: InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget? = null,
) {
  public class Builder {
    /**
     * How much effort the model should put into its response. Higher effort levels may result in more thorough analysis
     * but take longer. Valid values are `low`, `medium`, `high`, `xhigh`, or `max`.
     */
    public var effort: InlineComponentsSchemasMessagesOutputConfigPropertiesEffort? = null

    /**
     * A schema to specify Claude's output format in responses. See [structured
     * outputs](https://platform.claude.com/docs/en/build-with-claude/structured-outputs).
     */
    public var format: InlineComponentsSchemasMessagesOutputConfigPropertiesFormat? = null

    /**
     * Task budget for an agentic turn. The model sees a countdown of remaining tokens and uses it to prioritize work
     * and wind down gracefully. Advisory — does not enforce a hard cap.
     */
    public var taskBudget: InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget? = null

    public fun build(): MessagesOutputConfig = MessagesOutputConfig(
      effort = effort,
      format = format,
      taskBudget = taskBudget,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesOutputConfig = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MessagesOutputConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesOutputConfig {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesOutputConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("MessagesOutputConfig must be a JSON object")
      return MessagesOutputConfig(
        effort = raw["effort"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesOutputConfigPropertiesEffort?>(element) },
        format = raw["format"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesOutputConfigPropertiesFormat?>(element) },
        taskBudget = raw["task_budget"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasMessagesOutputConfigPropertiesTaskBudget?>(element) },
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

public fun messagesOutputConfig(block: MessagesOutputConfig.Builder.() -> Unit): MessagesOutputConfig =
  MessagesOutputConfig.build(block)
