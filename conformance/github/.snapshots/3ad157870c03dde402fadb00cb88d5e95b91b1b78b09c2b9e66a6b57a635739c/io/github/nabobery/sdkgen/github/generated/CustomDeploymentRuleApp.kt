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
 * A GitHub App that is providing a custom deployment protection rule.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/custom-deployment-rule-app
 */
@Serializable(with = CustomDeploymentRuleApp.Serializer::class)
public class CustomDeploymentRuleApp(
  /**
   * The unique identifier of the deployment protection rule integration.
   */
  public val id: Int,
  /**
   * The URL for the endpoint to get details about the app.
   */
  public val integrationUrl: String,
  /**
   * The node ID for the deployment protection rule integration.
   */
  public val nodeId: String,
  /**
   * The slugified name of the deployment protection rule integration.
   */
  public val slug: String,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var integrationUrlValue: String? = null

    public var integrationUrl: String
      get() = requireNotNull(integrationUrlValue) { "integrationUrl is required" }
      set(`value`) {
        integrationUrlValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    public fun build(): CustomDeploymentRuleApp {
      check(idValue != null) { "id is required" }
      check(integrationUrlValue != null) { "integrationUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(slugValue != null) { "slug is required" }
      return CustomDeploymentRuleApp(
        id = id,
        integrationUrl = integrationUrl,
        nodeId = nodeId,
        slug = slug,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CustomDeploymentRuleApp = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CustomDeploymentRuleApp> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CustomDeploymentRuleApp {
      val jsonDecoder = decoder.requireJsonDecoder("CustomDeploymentRuleApp")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CustomDeploymentRuleApp must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val integrationUrl = json.decodeRequired<String>(rawObject, "integration_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      return CustomDeploymentRuleApp(
        id = id,
        integrationUrl = integrationUrl,
        nodeId = nodeId,
        slug = slug,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CustomDeploymentRuleApp) {
      val jsonEncoder = encoder.requireJsonEncoder("CustomDeploymentRuleApp")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("integration_url", value.integrationUrl)
        put("node_id", value.nodeId)
        put("slug", value.slug)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun customDeploymentRuleApp(block: CustomDeploymentRuleApp.Builder.() -> Unit): CustomDeploymentRuleApp = CustomDeploymentRuleApp.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CustomDeploymentRuleApp is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
