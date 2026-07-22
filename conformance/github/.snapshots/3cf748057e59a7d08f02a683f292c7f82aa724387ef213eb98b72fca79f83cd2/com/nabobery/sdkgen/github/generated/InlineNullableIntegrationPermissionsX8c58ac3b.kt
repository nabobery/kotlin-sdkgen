package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 * The set of permissions for the GitHub app
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-integration/properties/permissions
 */
@Serializable(with = InlineNullableIntegrationPermissionsX8c58ac3b.Serializer::class)
public class InlineNullableIntegrationPermissionsX8c58ac3b(
  public val checks: String? = null,
  public val contents: String? = null,
  public val deployments: String? = null,
  public val issues: String? = null,
  public val metadata: String? = null,
) {
  public class Builder {
    public var checks: String? = null

    public var contents: String? = null

    public var deployments: String? = null

    public var issues: String? = null

    public var metadata: String? = null

    public fun build(): InlineNullableIntegrationPermissionsX8c58ac3b = InlineNullableIntegrationPermissionsX8c58ac3b(
      checks = checks,
      contents = contents,
      deployments = deployments,
      issues = issues,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineNullableIntegrationPermissionsX8c58ac3b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineNullableIntegrationPermissionsX8c58ac3b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNullableIntegrationPermissionsX8c58ac3b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNullableIntegrationPermissionsX8c58ac3b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineNullableIntegrationPermissionsX8c58ac3b must be a JSON object")
      return InlineNullableIntegrationPermissionsX8c58ac3b(
        checks = rawObject["checks"]?.let { json.decodeFromJsonElement<String>(it) },
        contents = rawObject["contents"]?.let { json.decodeFromJsonElement<String>(it) },
        deployments = rawObject["deployments"]?.let { json.decodeFromJsonElement<String>(it) },
        issues = rawObject["issues"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineNullableIntegrationPermissionsX8c58ac3b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineNullableIntegrationPermissionsX8c58ac3b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.checks?.let { put("checks", it) }
        value.contents?.let { put("contents", it) }
        value.deployments?.let { put("deployments", it) }
        value.issues?.let { put("issues", it) }
        value.metadata?.let { put("metadata", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineNullableIntegrationPermissionsX8c58ac3b(block: InlineNullableIntegrationPermissionsX8c58ac3b.Builder.() -> Unit): InlineNullableIntegrationPermissionsX8c58ac3b = InlineNullableIntegrationPermissionsX8c58ac3b.build(block)
