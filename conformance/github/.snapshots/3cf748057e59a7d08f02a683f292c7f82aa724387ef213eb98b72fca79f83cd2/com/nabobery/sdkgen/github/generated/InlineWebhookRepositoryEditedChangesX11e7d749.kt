package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-edited/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-edited/properties/changes
 */
@Serializable(with = InlineWebhookRepositoryEditedChangesX11e7d749.Serializer::class)
public class InlineWebhookRepositoryEditedChangesX11e7d749(
  public val defaultBranch: InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de? = null,
  public val description: InlineWebhookRepositoryEditedChangesDescriptionXc9eaaf09? = null,
  public val homepage: InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a? = null,
  public val topics: InlineWebhookRepositoryEditedChangesTopicsXd6a3c754? = null,
) {
  public class Builder {
    public var defaultBranch: InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de? = null

    public var description: InlineWebhookRepositoryEditedChangesDescriptionXc9eaaf09? = null

    public var homepage: InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a? = null

    public var topics: InlineWebhookRepositoryEditedChangesTopicsXd6a3c754? = null

    public fun build(): InlineWebhookRepositoryEditedChangesX11e7d749 = InlineWebhookRepositoryEditedChangesX11e7d749(
      defaultBranch = defaultBranch,
      description = description,
      homepage = homepage,
      topics = topics,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryEditedChangesX11e7d749 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookRepositoryEditedChangesX11e7d749> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryEditedChangesX11e7d749 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryEditedChangesX11e7d749")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryEditedChangesX11e7d749 must be a JSON object")
      return InlineWebhookRepositoryEditedChangesX11e7d749(
        defaultBranch = rawObject["default_branch"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryEditedChangesDefaultBranchXf47b45de>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryEditedChangesDescriptionXc9eaaf09>(it) },
        homepage = rawObject["homepage"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a>(it) },
        topics = rawObject["topics"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryEditedChangesTopicsXd6a3c754>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryEditedChangesX11e7d749) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryEditedChangesX11e7d749")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultBranch?.let { put("default_branch", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.homepage?.let { put("homepage", json.encodeToJsonElement(it)) }
        value.topics?.let { put("topics", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryEditedChangesX11e7d749(block: InlineWebhookRepositoryEditedChangesX11e7d749.Builder.() -> Unit): InlineWebhookRepositoryEditedChangesX11e7d749 = InlineWebhookRepositoryEditedChangesX11e7d749.build(block)
