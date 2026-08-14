package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The set of permissions for the GitHub app
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/integration/properties/permissions
 */
@Serializable(with = InlineIntegrationPermissionsXff8f9bc6.Serializer::class)
public class InlineIntegrationPermissionsXff8f9bc6(
  public val checks: String? = null,
  public val contents: String? = null,
  public val deployments: String? = null,
  public val issues: String? = null,
  public val metadata: String? = null,
  additionalProperties: Map<String, String> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, String> =
      copyAndValidateInlineIntegrationPermissionsXff8f9bc6AdditionalProperties(additionalProperties)

  public class Builder {
    public var checks: String? = null

    public var contents: String? = null

    public var deployments: String? = null

    public var issues: String? = null

    public var metadata: String? = null

    private var additionalPropertiesValue: Map<String, String> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, String>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): InlineIntegrationPermissionsXff8f9bc6 = InlineIntegrationPermissionsXff8f9bc6(
      checks = checks,
      contents = contents,
      deployments = deployments,
      issues = issues,
      metadata = metadata,
      additionalProperties = additionalProperties,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineIntegrationPermissionsXff8f9bc6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineIntegrationPermissionsXff8f9bc6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIntegrationPermissionsXff8f9bc6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIntegrationPermissionsXff8f9bc6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineIntegrationPermissionsXff8f9bc6 must be a JSON object")
      return InlineIntegrationPermissionsXff8f9bc6(
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<String>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<String>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<String>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<String>(it) },
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("checks", "contents", "deployments", "issues", "metadata") }.mapValues { (_, element) -> json.decodeFromJsonElement<String>(element) }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineIntegrationPermissionsXff8f9bc6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineIntegrationPermissionsXff8f9bc6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.checks?.let { put("checks", it) }
        value.contents?.let { put("contents", it) }
        value.deployments?.let { put("deployments", it) }
        value.issues?.let { put("issues", it) }
        value.metadata?.let { put("metadata", it) }
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("checks", "contents", "deployments", "issues", "metadata")) { "InlineIntegrationPermissionsXff8f9bc6 additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, json.encodeToJsonElement(additionalValue))
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateInlineIntegrationPermissionsXff8f9bc6AdditionalProperties(additionalProperties: Map<String, String>): Map<String, String> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("checks", "contents", "deployments", "issues", "metadata") }
  require(collision == null) { "InlineIntegrationPermissionsXff8f9bc6 additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun inlineIntegrationPermissionsXff8f9bc6(block: InlineIntegrationPermissionsXff8f9bc6.Builder.() -> Unit): InlineIntegrationPermissionsXff8f9bc6 = InlineIntegrationPermissionsXff8f9bc6.build(block)
