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
 * Repositories associated with a code security configuration and attachment status
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration-repositories
 */
@Serializable(with = CodeSecurityConfigurationRepositories.Serializer::class)
public class CodeSecurityConfigurationRepositories(
  public val repository: SimpleRepository? = null,
  /**
   * The attachment status of the code security configuration on the repository.
   */
  public val status: InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984? = null,
) {
  public class Builder {
    public var repository: SimpleRepository? = null

    /**
     * The attachment status of the code security configuration on the repository.
     */
    public var status: InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984? = null

    public fun build(): CodeSecurityConfigurationRepositories = CodeSecurityConfigurationRepositories(
      repository = repository,
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeSecurityConfigurationRepositories = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeSecurityConfigurationRepositories> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeSecurityConfigurationRepositories {
      val jsonDecoder = decoder.requireJsonDecoder("CodeSecurityConfigurationRepositories")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeSecurityConfigurationRepositories must be a JSON object")
      return CodeSecurityConfigurationRepositories(
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<SimpleRepository>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationRepositoriesStatusX34c6c984>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeSecurityConfigurationRepositories) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeSecurityConfigurationRepositories")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeSecurityConfigurationRepositories(block: CodeSecurityConfigurationRepositories.Builder.() -> Unit): CodeSecurityConfigurationRepositories = CodeSecurityConfigurationRepositories.build(block)
