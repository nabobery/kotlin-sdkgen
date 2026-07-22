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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Repository rule violation was detected
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-violation-error
 */
@Serializable(with = RepositoryRuleViolationError.Serializer::class)
public class RepositoryRuleViolationError(
  public val documentationUrl: String? = null,
  public val message: String? = null,
  public val metadata: InlineRepositoryRuleViolationErrorMetadataXb221a4a2? = null,
  public val status: String? = null,
) {
  public class Builder {
    public var documentationUrl: String? = null

    public var message: String? = null

    public var metadata: InlineRepositoryRuleViolationErrorMetadataXb221a4a2? = null

    public var status: String? = null

    public fun build(): RepositoryRuleViolationError = RepositoryRuleViolationError(
      documentationUrl = documentationUrl,
      message = message,
      metadata = metadata,
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryRuleViolationError = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RepositoryRuleViolationError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryRuleViolationError {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryRuleViolationError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryRuleViolationError must be a JSON object")
      return RepositoryRuleViolationError(
        documentationUrl = rawObject["documentation_url"]?.let { json.decodeFromJsonElement<String>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineRepositoryRuleViolationErrorMetadataXb221a4a2>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryRuleViolationError) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryRuleViolationError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.documentationUrl?.let { put("documentation_url", it) }
        value.message?.let { put("message", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryRuleViolationError(block: RepositoryRuleViolationError.Builder.() -> Unit): RepositoryRuleViolationError = RepositoryRuleViolationError.build(block)
