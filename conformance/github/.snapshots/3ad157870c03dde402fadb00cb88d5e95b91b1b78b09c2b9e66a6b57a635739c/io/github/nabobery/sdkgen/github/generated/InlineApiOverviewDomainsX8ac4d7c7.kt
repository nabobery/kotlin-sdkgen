package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/api-overview/properties/domains.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/api-overview/properties/domains
 */
@Serializable(with = InlineApiOverviewDomainsX8ac4d7c7.Serializer::class)
public class InlineApiOverviewDomainsX8ac4d7c7(
  actions: List<String>? = null,
  public val actionsInbound: InlineApiOverviewDomainsActionsInboundX2f22faa6? = null,
  public val artifactAttestations: InlineApiOverviewDomainsArtifactAttestationsXe16b0123? = null,
  codespaces: List<String>? = null,
  copilot: List<String>? = null,
  packages: List<String>? = null,
  website: List<String>? = null,
) {
  public val actions: List<String>? = actions?.let { collection0 -> collection0.toList() }

  public val codespaces: List<String>? = codespaces?.let { collection0 -> collection0.toList() }

  public val copilot: List<String>? = copilot?.let { collection0 -> collection0.toList() }

  public val packages: List<String>? = packages?.let { collection0 -> collection0.toList() }

  public val website: List<String>? = website?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var actionsValue: List<String>? = null

    public var actions: List<String>?
      get() = actionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        actionsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var actionsInbound: InlineApiOverviewDomainsActionsInboundX2f22faa6? = null

    public var artifactAttestations: InlineApiOverviewDomainsArtifactAttestationsXe16b0123? = null

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

    private var packagesValue: List<String>? = null

    public var packages: List<String>?
      get() = packagesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        packagesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var websiteValue: List<String>? = null

    public var website: List<String>?
      get() = websiteValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        websiteValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineApiOverviewDomainsX8ac4d7c7 = InlineApiOverviewDomainsX8ac4d7c7(
      actions = actions,
      actionsInbound = actionsInbound,
      artifactAttestations = artifactAttestations,
      codespaces = codespaces,
      copilot = copilot,
      packages = packages,
      website = website,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApiOverviewDomainsX8ac4d7c7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineApiOverviewDomainsX8ac4d7c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApiOverviewDomainsX8ac4d7c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApiOverviewDomainsX8ac4d7c7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApiOverviewDomainsX8ac4d7c7 must be a JSON object")
      return InlineApiOverviewDomainsX8ac4d7c7(
        actions = rawObject["actions"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        actionsInbound = rawObject["actions_inbound"]?.let { json.decodeFromJsonElement<InlineApiOverviewDomainsActionsInboundX2f22faa6>(it) },
        artifactAttestations = rawObject["artifact_attestations"]?.let { json.decodeFromJsonElement<InlineApiOverviewDomainsArtifactAttestationsXe16b0123>(it) },
        codespaces = rawObject["codespaces"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        copilot = rawObject["copilot"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        packages = rawObject["packages"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        website = rawObject["website"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApiOverviewDomainsX8ac4d7c7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApiOverviewDomainsX8ac4d7c7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.actions?.let { put("actions", json.encodeToJsonElement(it)) }
        value.actionsInbound?.let { put("actions_inbound", json.encodeToJsonElement(it)) }
        value.artifactAttestations?.let { put("artifact_attestations", json.encodeToJsonElement(it)) }
        value.codespaces?.let { put("codespaces", json.encodeToJsonElement(it)) }
        value.copilot?.let { put("copilot", json.encodeToJsonElement(it)) }
        value.packages?.let { put("packages", json.encodeToJsonElement(it)) }
        value.website?.let { put("website", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApiOverviewDomainsX8ac4d7c7(block: InlineApiOverviewDomainsX8ac4d7c7.Builder.() -> Unit): InlineApiOverviewDomainsX8ac4d7c7 = InlineApiOverviewDomainsX8ac4d7c7.build(block)
