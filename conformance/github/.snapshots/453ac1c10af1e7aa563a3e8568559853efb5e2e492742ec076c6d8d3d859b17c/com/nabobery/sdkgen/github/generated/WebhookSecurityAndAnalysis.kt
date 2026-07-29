package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-security-and-analysis.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-security-and-analysis
 */
@Serializable(with = WebhookSecurityAndAnalysis.Serializer::class)
public class WebhookSecurityAndAnalysis(
  public val changes: InlineWebhookSecurityAndAnalysisChangesX390cde13,
  public val repository: FullRepository,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var changesValue: InlineWebhookSecurityAndAnalysisChangesX390cde13? = null

    public var changes: InlineWebhookSecurityAndAnalysisChangesX390cde13
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var repositoryValue: FullRepository? = null

    public var repository: FullRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookSecurityAndAnalysis {
      check(changesValue != null) { "changes is required" }
      check(repositoryValue != null) { "repository is required" }
      return WebhookSecurityAndAnalysis(
        changes = changes,
        repository = repository,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookSecurityAndAnalysis = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookSecurityAndAnalysis> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSecurityAndAnalysis {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSecurityAndAnalysis")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSecurityAndAnalysis must be a JSON object")
      val changes = json.decodeRequired<InlineWebhookSecurityAndAnalysisChangesX390cde13>(rawObject, "changes")
      val repository = json.decodeRequired<FullRepository>(rawObject, "repository")
      return WebhookSecurityAndAnalysis(
        changes = changes,
        repository = repository,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSecurityAndAnalysis) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSecurityAndAnalysis")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("changes", json.encodeToJsonElement(value.changes))
        put("repository", json.encodeToJsonElement(value.repository))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookSecurityAndAnalysis(block: WebhookSecurityAndAnalysis.Builder.() -> Unit): WebhookSecurityAndAnalysis = WebhookSecurityAndAnalysis.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSecurityAndAnalysis is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
