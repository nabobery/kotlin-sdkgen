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
 * Code security configuration associated with a repository and attachment status
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration-for-repository
 */
@Serializable(with = CodeSecurityConfigurationForRepository.Serializer::class)
public class CodeSecurityConfigurationForRepository(
  public val configuration: CodeSecurityConfiguration? = null,
  /**
   * The attachment status of the code security configuration on the repository.
   */
  public val status: InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae? = null,
) {
  public class Builder {
    public var configuration: CodeSecurityConfiguration? = null

    /**
     * The attachment status of the code security configuration on the repository.
     */
    public var status: InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae? = null

    public fun build(): CodeSecurityConfigurationForRepository = CodeSecurityConfigurationForRepository(
      configuration = configuration,
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeSecurityConfigurationForRepository = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeSecurityConfigurationForRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeSecurityConfigurationForRepository {
      val jsonDecoder = decoder.requireJsonDecoder("CodeSecurityConfigurationForRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeSecurityConfigurationForRepository must be a JSON object")
      return CodeSecurityConfigurationForRepository(
        configuration = rawObject["configuration"]?.let { json.decodeFromJsonElement<CodeSecurityConfiguration>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationForRepositoryStatusX7f67dbae>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeSecurityConfigurationForRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeSecurityConfigurationForRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.configuration?.let { put("configuration", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeSecurityConfigurationForRepository(block: CodeSecurityConfigurationForRepository.Builder.() -> Unit): CodeSecurityConfigurationForRepository = CodeSecurityConfigurationForRepository.build(block)
