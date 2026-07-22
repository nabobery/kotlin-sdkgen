package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Api Overview
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/api-overview
 */
@Serializable(with = ApiOverview.Serializer::class)
public class ApiOverview(
  public val verifiablePasswordAuthentication: Boolean,
  public val actions: List<String>? = null,
  public val actionsMacos: List<String>? = null,
  public val api: List<String>? = null,
  public val codespaces: List<String>? = null,
  public val copilot: List<String>? = null,
  public val dependabot: List<String>? = null,
  public val domains: InlineApiOverviewDomainsX8ac4d7c7? = null,
  public val git: List<String>? = null,
  public val githubEnterpriseImporter: List<String>? = null,
  public val hooks: List<String>? = null,
  public val importer: List<String>? = null,
  public val packages: List<String>? = null,
  public val pages: List<String>? = null,
  public val sshKeyFingerprints: InlineApiOverviewSshKeyFingerprintsXef6779a2? = null,
  public val sshKeys: List<String>? = null,
  public val web: List<String>? = null,
) {
  public class Builder {
    private var verifiablePasswordAuthenticationValue: Boolean? = null

    public var verifiablePasswordAuthentication: Boolean
      get() = requireNotNull(verifiablePasswordAuthenticationValue) { "verifiablePasswordAuthentication is required" }
      set(`value`) {
        verifiablePasswordAuthenticationValue = value
      }

    public var actions: List<String>? = null

    public var actionsMacos: List<String>? = null

    public var api: List<String>? = null

    public var codespaces: List<String>? = null

    public var copilot: List<String>? = null

    public var dependabot: List<String>? = null

    public var domains: InlineApiOverviewDomainsX8ac4d7c7? = null

    public var git: List<String>? = null

    public var githubEnterpriseImporter: List<String>? = null

    public var hooks: List<String>? = null

    public var importer: List<String>? = null

    public var packages: List<String>? = null

    public var pages: List<String>? = null

    public var sshKeyFingerprints: InlineApiOverviewSshKeyFingerprintsXef6779a2? = null

    public var sshKeys: List<String>? = null

    public var web: List<String>? = null

    public fun build(): ApiOverview {
      check(verifiablePasswordAuthenticationValue != null) { "verifiablePasswordAuthentication is required" }
      return ApiOverview(
        verifiablePasswordAuthentication = verifiablePasswordAuthentication,
        actions = actions,
        actionsMacos = actionsMacos,
        api = api,
        codespaces = codespaces,
        copilot = copilot,
        dependabot = dependabot,
        domains = domains,
        git = git,
        githubEnterpriseImporter = githubEnterpriseImporter,
        hooks = hooks,
        importer = importer,
        packages = packages,
        pages = pages,
        sshKeyFingerprints = sshKeyFingerprints,
        sshKeys = sshKeys,
        web = web,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ApiOverview = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ApiOverview> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ApiOverview {
      val jsonDecoder = decoder.requireJsonDecoder("ApiOverview")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ApiOverview must be a JSON object")
      val verifiablePasswordAuthentication = json.decodeRequired<Boolean>(rawObject, "verifiable_password_authentication")
      return ApiOverview(
        verifiablePasswordAuthentication = verifiablePasswordAuthentication,
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        actionsMacos = rawObject["actions_macos"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        api = rawObject["api"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        codespaces = rawObject["codespaces"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        copilot = rawObject["copilot"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        dependabot = rawObject["dependabot"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        domains = rawObject["domains"]?.let { json.decodeFromJsonElement<InlineApiOverviewDomainsX8ac4d7c7>(it) },
        git = rawObject["git"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        githubEnterpriseImporter = rawObject["github_enterprise_importer"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        hooks = rawObject["hooks"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        importer = rawObject["importer"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        pages = rawObject["pages"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        sshKeyFingerprints = rawObject["ssh_key_fingerprints"]?.let { json.decodeFromJsonElement<InlineApiOverviewSshKeyFingerprintsXef6779a2>(it) },
        sshKeys = rawObject["ssh_keys"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        web = rawObject["web"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ApiOverview) {
      val jsonEncoder = encoder.requireJsonEncoder("ApiOverview")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("verifiable_password_authentication", json.encodeToJsonElement(value.verifiablePasswordAuthentication))
        value.actions?.let { put("actions", json.encodeToJsonElement(it)) }
        value.actionsMacos?.let { put("actions_macos", json.encodeToJsonElement(it)) }
        value.api?.let { put("api", json.encodeToJsonElement(it)) }
        value.codespaces?.let { put("codespaces", json.encodeToJsonElement(it)) }
        value.copilot?.let { put("copilot", json.encodeToJsonElement(it)) }
        value.dependabot?.let { put("dependabot", json.encodeToJsonElement(it)) }
        value.domains?.let { put("domains", json.encodeToJsonElement(it)) }
        value.git?.let { put("git", json.encodeToJsonElement(it)) }
        value.githubEnterpriseImporter?.let { put("github_enterprise_importer", json.encodeToJsonElement(it)) }
        value.hooks?.let { put("hooks", json.encodeToJsonElement(it)) }
        value.importer?.let { put("importer", json.encodeToJsonElement(it)) }
        value.packages?.let { put("packages", json.encodeToJsonElement(it)) }
        value.pages?.let { put("pages", json.encodeToJsonElement(it)) }
        value.sshKeyFingerprints?.let { put("ssh_key_fingerprints", json.encodeToJsonElement(it)) }
        value.sshKeys?.let { put("ssh_keys", json.encodeToJsonElement(it)) }
        value.web?.let { put("web", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun apiOverview(block: ApiOverview.Builder.() -> Unit): ApiOverview = ApiOverview.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ApiOverview is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
