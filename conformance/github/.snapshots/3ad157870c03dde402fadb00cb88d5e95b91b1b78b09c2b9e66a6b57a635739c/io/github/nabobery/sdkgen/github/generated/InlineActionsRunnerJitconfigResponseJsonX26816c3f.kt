package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/responses/actions_runner_jitconfig/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/responses/actions_runner_jitconfig/content/application~1json/schema
 */
@Serializable(with = InlineActionsRunnerJitconfigResponseJsonX26816c3f.Serializer::class)
public class InlineActionsRunnerJitconfigResponseJsonX26816c3f(
  /**
   * The base64 encoded runner configuration.
   */
  public val encodedJitConfig: String,
  public val runner: Runner,
) {
  public class Builder {
    private var encodedJitConfigValue: String? = null

    public var encodedJitConfig: String
      get() = requireNotNull(encodedJitConfigValue) { "encodedJitConfig is required" }
      set(`value`) {
        encodedJitConfigValue = value
      }

    private var runnerValue: Runner? = null

    public var runner: Runner
      get() = requireNotNull(runnerValue) { "runner is required" }
      set(`value`) {
        runnerValue = value
      }

    public fun build(): InlineActionsRunnerJitconfigResponseJsonX26816c3f {
      check(encodedJitConfigValue != null) { "encodedJitConfig is required" }
      check(runnerValue != null) { "runner is required" }
      return InlineActionsRunnerJitconfigResponseJsonX26816c3f(
        encodedJitConfig = encodedJitConfig,
        runner = runner,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineActionsRunnerJitconfigResponseJsonX26816c3f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineActionsRunnerJitconfigResponseJsonX26816c3f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineActionsRunnerJitconfigResponseJsonX26816c3f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineActionsRunnerJitconfigResponseJsonX26816c3f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineActionsRunnerJitconfigResponseJsonX26816c3f must be a JSON object")
      val encodedJitConfig = json.decodeRequired<String>(rawObject, "encoded_jit_config")
      val runner = json.decodeRequired<Runner>(rawObject, "runner")
      return InlineActionsRunnerJitconfigResponseJsonX26816c3f(
        encodedJitConfig = encodedJitConfig,
        runner = runner,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineActionsRunnerJitconfigResponseJsonX26816c3f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineActionsRunnerJitconfigResponseJsonX26816c3f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encoded_jit_config", value.encodedJitConfig)
        put("runner", json.encodeToJsonElement(value.runner))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineActionsRunnerJitconfigResponseJsonX26816c3f(block: InlineActionsRunnerJitconfigResponseJsonX26816c3f.Builder.() -> Unit): InlineActionsRunnerJitconfigResponseJsonX26816c3f = InlineActionsRunnerJitconfigResponseJsonX26816c3f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineActionsRunnerJitconfigResponseJsonX26816c3f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
