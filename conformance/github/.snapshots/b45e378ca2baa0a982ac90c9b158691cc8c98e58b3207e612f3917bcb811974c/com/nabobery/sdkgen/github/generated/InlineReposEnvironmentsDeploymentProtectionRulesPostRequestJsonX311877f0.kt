package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1deployment_protection
 * _rules/post/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments~1{environment_name}~1deployment_protection
 * _rules/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0.Serializer::class)
public class InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0(
  /**
   * The ID of the custom app that will be enabled on the environment.
   */
  public val integrationId: Int? = null,
) {
  public class Builder {
    /**
     * The ID of the custom app that will be enabled on the environment.
     */
    public var integrationId: Int? = null

    public fun build(): InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0 = InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0(
      integrationId = integrationId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0 must be a JSON object")
      return InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0(
        integrationId = rawObject["integration_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.integrationId?.let { put("integration_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0(block: InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0.Builder.() -> Unit): InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0 = InlineReposEnvironmentsDeploymentProtectionRulesPostRequestJsonX311877f0.build(block)
