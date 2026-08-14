package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputShellCallOutputItem/properties/output/items
 */
@Serializable(with = InlineOutputShellCallOutputItemOutputItemX141fabad.Serializer::class)
public class InlineOutputShellCallOutputItemOutputItemX141fabad(
  public val outcome: InlineOutputShellCallOutputItemOutputItemOutcomeX15fa4089,
  public val stderr: String,
  public val stdout: String,
) {
  public class Builder {
    private var outcomeValue: InlineOutputShellCallOutputItemOutputItemOutcomeX15fa4089? = null

    public var outcome: InlineOutputShellCallOutputItemOutputItemOutcomeX15fa4089
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

    public fun build(): InlineOutputShellCallOutputItemOutputItemX141fabad {
      check(outcomeValue != null) { "outcome is required" }
      check(stderrValue != null) { "stderr is required" }
      check(stdoutValue != null) { "stdout is required" }
      return InlineOutputShellCallOutputItemOutputItemX141fabad(
        outcome = outcome,
        stderr = stderr,
        stdout = stdout,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputShellCallOutputItemOutputItemX141fabad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputShellCallOutputItemOutputItemX141fabad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputShellCallOutputItemOutputItemX141fabad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputShellCallOutputItemOutputItemX141fabad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputShellCallOutputItemOutputItemX141fabad must be a JSON object")
      val outcome = json.decodeRequired<InlineOutputShellCallOutputItemOutputItemOutcomeX15fa4089>(rawObject, "outcome")
      val stderr = json.decodeRequired<String>(rawObject, "stderr")
      val stdout = json.decodeRequired<String>(rawObject, "stdout")
      return InlineOutputShellCallOutputItemOutputItemX141fabad(
        outcome = outcome,
        stderr = stderr,
        stdout = stdout,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputShellCallOutputItemOutputItemX141fabad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputShellCallOutputItemOutputItemX141fabad")
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

public fun inlineOutputShellCallOutputItemOutputItemX141fabad(block: InlineOutputShellCallOutputItemOutputItemX141fabad.Builder.() -> Unit): InlineOutputShellCallOutputItemOutputItemX141fabad = InlineOutputShellCallOutputItemOutputItemX141fabad.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputShellCallOutputItemOutputItemX141fabad is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
