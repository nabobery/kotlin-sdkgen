package com.nabobery.sdkgen.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/output/items.
 */
@Serializable(with = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems.Serializer::class)
public class InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems(
  public val outcome:
      InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome,
  public val stderr: String,
  public val stdout: String,
) {
  public class Builder {
    private var outcomeValue:
        InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome? =
        null

    public var outcome:
        InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome
      get() = requireNotNull(outcomeValue) { "outcome is required" }
      set(`value`) {
        outcomeValue = value
      }

    private var stderrValue: String? = null

    public var stderr: String
      get() = requireNotNull(stderrValue) { "stderr is required" }
      set(`value`) {
        stderrValue = value
      }

    private var stdoutValue: String? = null

    public var stdout: String
      get() = requireNotNull(stdoutValue) { "stdout is required" }
      set(`value`) {
        stdoutValue = value
      }

    public fun build(): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems {
      check(outcomeValue != null) { "outcome is required" }
      check(stderrValue != null) { "stderr is required" }
      check(stdoutValue != null) { "stdout is required" }
      return InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems(
        outcome = outcome,
        stderr = stderr,
        stdout = stdout,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems must be a " +
          "JSON object")
      val outcome = json
        .decodeRequired<InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItemsPropertiesOutcome>(raw,
          "outcome")
      val stderr = json.decodeRequired<String>(raw, "stderr")
      val stdout = json.decodeRequired<String>(raw, "stdout")
      return InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems(
        outcome = outcome,
        stderr = stderr,
        stdout = stdout,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("outcome", json.encodeToJsonElement(value.outcome))
        put("stderr", value.stderr)
        put("stdout", value.stdout)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems(block: InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems.Builder.() -> Unit): InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems = InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasOutputShellCallOutputItemPropertiesOutputItems is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
