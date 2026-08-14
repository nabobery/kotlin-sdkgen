package io.github.nabobery.sdkgen.github.generated

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
 * Required status check
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-params-status-check-configuration
 */
@Serializable(with = RepositoryRuleParamsStatusCheckConfiguration.Serializer::class)
public class RepositoryRuleParamsStatusCheckConfiguration(
  /**
   * The status check context name that must be present on the commit.
   */
  public val context: String,
  /**
   * The optional integration ID that this status check must originate from.
   */
  public val integrationId: Int? = null,
) {
  public class Builder {
    private var contextValue: String? = null

    public var context: String
      get() = requireNotNull(contextValue) { "context is required" }
      set(`value`) {
        contextValue = value
      }

    /**
     * The optional integration ID that this status check must originate from.
     */
    public var integrationId: Int? = null

    public fun build(): RepositoryRuleParamsStatusCheckConfiguration {
      check(contextValue != null) { "context is required" }
      return RepositoryRuleParamsStatusCheckConfiguration(
        context = context,
        integrationId = integrationId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleParamsStatusCheckConfiguration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryRuleParamsStatusCheckConfiguration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleParamsStatusCheckConfiguration {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleParamsStatusCheckConfiguration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleParamsStatusCheckConfiguration must be a JSON object")
      val context = json.decodeRequired<String>(rawObject, "context")
      return RepositoryRuleParamsStatusCheckConfiguration(
        context = context,
        integrationId = rawObject["integration_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleParamsStatusCheckConfiguration) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleParamsStatusCheckConfiguration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("context", value.context)
        value.integrationId?.let { put("integration_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleParamsStatusCheckConfiguration(block: RepositoryRuleParamsStatusCheckConfiguration.Builder.() -> Unit): RepositoryRuleParamsStatusCheckConfiguration = RepositoryRuleParamsStatusCheckConfiguration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryRuleParamsStatusCheckConfiguration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
