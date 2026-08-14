package io.github.nabobery.sdkgen.github.generated

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
  actions: List<String>? = null,
  actionsMacos: List<String>? = null,
  api: List<String>? = null,
  codespaces: List<String>? = null,
  copilot: List<String>? = null,
  dependabot: List<String>? = null,
  public val domains: InlineApiOverviewDomainsX8ac4d7c7? = null,
  git: List<String>? = null,
  githubEnterpriseImporter: List<String>? = null,
  hooks: List<String>? = null,
  importer: List<String>? = null,
  packages: List<String>? = null,
  pages: List<String>? = null,
  public val sshKeyFingerprints: InlineApiOverviewSshKeyFingerprintsXef6779a2? = null,
  sshKeys: List<String>? = null,
  web: List<String>? = null,
) {
  public val actions: List<String>? = actions?.let { collection0 -> collection0.toList() }

  public val actionsMacos: List<String>? = actionsMacos?.let { collection0 -> collection0.toList() }

  public val api: List<String>? = api?.let { collection0 -> collection0.toList() }

  public val codespaces: List<String>? = codespaces?.let { collection0 -> collection0.toList() }

  public val copilot: List<String>? = copilot?.let { collection0 -> collection0.toList() }

  public val dependabot: List<String>? = dependabot?.let { collection0 -> collection0.toList() }

  public val git: List<String>? = git?.let { collection0 -> collection0.toList() }

  public val githubEnterpriseImporter: List<String>? =
      githubEnterpriseImporter?.let { collection0 -> collection0.toList() }

  public val hooks: List<String>? = hooks?.let { collection0 -> collection0.toList() }

  public val importer: List<String>? = importer?.let { collection0 -> collection0.toList() }

  public val packages: List<String>? = packages?.let { collection0 -> collection0.toList() }

  public val pages: List<String>? = pages?.let { collection0 -> collection0.toList() }

  public val sshKeys: List<String>? = sshKeys?.let { collection0 -> collection0.toList() }

  public val web: List<String>? = web?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var verifiablePasswordAuthenticationValue: Boolean? = null

    public var verifiablePasswordAuthentication: Boolean
      get() = requireNotNull(verifiablePasswordAuthenticationValue) { "verifiablePasswordAuthentication is required" }
      set(`value`) {
        verifiablePasswordAuthenticationValue = value
      }

    private var actionsValue: List<String>? = null

    public var actions: List<String>?
      get() = actionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        actionsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var actionsMacosValue: List<String>? = null

    public var actionsMacos: List<String>?
      get() = actionsMacosValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        actionsMacosValue = value?.let { collection0 -> collection0.toList() }
      }

    private var apiValue: List<String>? = null

    public var api: List<String>?
      get() = apiValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        apiValue = value?.let { collection0 -> collection0.toList() }
      }

    private var codespacesValue: List<String>? = null

    public var codespaces: List<String>?
      get() = codespacesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        codespacesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var copilotValue: List<String>? = null

    public var copilot: List<String>?
      get() = copilotValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        copilotValue = value?.let { collection0 -> collection0.toList() }
      }

    private var dependabotValue: List<String>? = null

    public var dependabot: List<String>?
      get() = dependabotValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        dependabotValue = value?.let { collection0 -> collection0.toList() }
      }

    public var domains: InlineApiOverviewDomainsX8ac4d7c7? = null

    private var gitValue: List<String>? = null

    public var git: List<String>?
      get() = gitValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        gitValue = value?.let { collection0 -> collection0.toList() }
      }

    private var githubEnterpriseImporterValue: List<String>? = null

    public var githubEnterpriseImporter: List<String>?
      get() = githubEnterpriseImporterValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        githubEnterpriseImporterValue = value?.let { collection0 -> collection0.toList() }
      }

    private var hooksValue: List<String>? = null

    public var hooks: List<String>?
      get() = hooksValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        hooksValue = value?.let { collection0 -> collection0.toList() }
      }

    private var importerValue: List<String>? = null

    public var importer: List<String>?
      get() = importerValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        importerValue = value?.let { collection0 -> collection0.toList() }
      }

    private var packagesValue: List<String>? = null

    public var packages: List<String>?
      get() = packagesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        packagesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var pagesValue: List<String>? = null

    public var pages: List<String>?
      get() = pagesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pagesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var sshKeyFingerprints: InlineApiOverviewSshKeyFingerprintsXef6779a2? = null

    private var sshKeysValue: List<String>? = null

    public var sshKeys: List<String>?
      get() = sshKeysValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        sshKeysValue = value?.let { collection0 -> collection0.toList() }
      }

    private var webValue: List<String>? = null

    public var web: List<String>?
      get() = webValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        webValue = value?.let { collection0 -> collection0.toList() }
      }

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

  internal object Serializer : KSerializer<ApiOverview> {
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
