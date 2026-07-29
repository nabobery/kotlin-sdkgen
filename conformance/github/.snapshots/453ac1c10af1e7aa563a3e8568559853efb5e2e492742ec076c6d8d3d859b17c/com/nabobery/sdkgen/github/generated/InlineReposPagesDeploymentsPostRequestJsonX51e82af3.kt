package com.nabobery.sdkgen.github.generated

import kotlin.Double
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
 * The object used to create GitHub Pages deployment
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages~1deployments/post/requestBody/content/application
 * ~1json/schema
 */
@Serializable(with = InlineReposPagesDeploymentsPostRequestJsonX51e82af3.Serializer::class)
public class InlineReposPagesDeploymentsPostRequestJsonX51e82af3(
  /**
   * The OIDC token issued by GitHub Actions certifying the origin of the deployment.
   */
  public val oidcToken: String,
  /**
   * A unique string that represents the version of the build for this deployment.
   */
  public val pagesBuildVersion: String,
  /**
   * The ID of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the
   * repository. Either `artifact_id` or `artifact_url` are required.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val artifactId: Double? = null,
  /**
   * The URL of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the
   * repository. Either `artifact_id` or `artifact_url` are required.
   */
  public val artifactUrl: String? = null,
  /**
   * The target environment for this GitHub Pages deployment.
   */
  public val environment: String? = null,
) {
  public class Builder {
    private var oidcTokenValue: String? = null

    public var oidcToken: String
      get() = requireNotNull(oidcTokenValue) { "oidcToken is required" }
      set(`value`) {
        oidcTokenValue = value
      }

    private var pagesBuildVersionValue: String? = null

    public var pagesBuildVersion: String
      get() = requireNotNull(pagesBuildVersionValue) { "pagesBuildVersion is required" }
      set(`value`) {
        pagesBuildVersionValue = value
      }

    /**
     * The ID of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the
     * repository. Either `artifact_id` or `artifact_url` are required.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var artifactId: Double? = null

    /**
     * The URL of an artifact that contains the .zip or .tar of static assets to deploy. The artifact belongs to the
     * repository. Either `artifact_id` or `artifact_url` are required.
     */
    public var artifactUrl: String? = null

    /**
     * The target environment for this GitHub Pages deployment.
     */
    public var environment: String? = null

    public fun build(): InlineReposPagesDeploymentsPostRequestJsonX51e82af3 {
      check(oidcTokenValue != null) { "oidcToken is required" }
      check(pagesBuildVersionValue != null) { "pagesBuildVersion is required" }
      return InlineReposPagesDeploymentsPostRequestJsonX51e82af3(
        oidcToken = oidcToken,
        pagesBuildVersion = pagesBuildVersion,
        artifactId = artifactId,
        artifactUrl = artifactUrl,
        environment = environment,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPagesDeploymentsPostRequestJsonX51e82af3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposPagesDeploymentsPostRequestJsonX51e82af3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPagesDeploymentsPostRequestJsonX51e82af3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPagesDeploymentsPostRequestJsonX51e82af3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPagesDeploymentsPostRequestJsonX51e82af3 must be a JSON object")
      val oidcToken = json.decodeRequired<String>(rawObject, "oidc_token")
      val pagesBuildVersion = json.decodeRequired<String>(rawObject, "pages_build_version")
      return InlineReposPagesDeploymentsPostRequestJsonX51e82af3(
        oidcToken = oidcToken,
        pagesBuildVersion = pagesBuildVersion,
        artifactId = rawObject["artifact_id"]?.let { json.decodeFromJsonElement<Double>(it) },
        artifactUrl = rawObject["artifact_url"]?.let { json.decodeFromJsonElement<String>(it) },
        environment = rawObject["environment"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesDeploymentsPostRequestJsonX51e82af3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPagesDeploymentsPostRequestJsonX51e82af3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("oidc_token", value.oidcToken)
        put("pages_build_version", value.pagesBuildVersion)
        value.artifactId?.let { put("artifact_id", json.encodeToJsonElement(it)) }
        value.artifactUrl?.let { put("artifact_url", it) }
        value.environment?.let { put("environment", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPagesDeploymentsPostRequestJsonX51e82af3(block: InlineReposPagesDeploymentsPostRequestJsonX51e82af3.Builder.() -> Unit): InlineReposPagesDeploymentsPostRequestJsonX51e82af3 = InlineReposPagesDeploymentsPostRequestJsonX51e82af3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPagesDeploymentsPostRequestJsonX51e82af3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
