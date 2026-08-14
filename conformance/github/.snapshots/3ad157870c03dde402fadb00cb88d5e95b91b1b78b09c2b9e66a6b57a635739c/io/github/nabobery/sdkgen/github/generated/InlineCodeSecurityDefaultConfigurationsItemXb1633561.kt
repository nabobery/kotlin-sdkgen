package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-security-default-configurations/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-default-configurations/items
 */
@Serializable(with = InlineCodeSecurityDefaultConfigurationsItemXb1633561.Serializer::class)
public class InlineCodeSecurityDefaultConfigurationsItemXb1633561(
  public val configuration: CodeSecurityConfiguration? = null,
  /**
   * The visibility of newly created repositories for which the code security configuration will be applied to by
   * default
   */
  public val defaultForNewRepos:
      InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02? = null,
) {
  public class Builder {
    public var configuration: CodeSecurityConfiguration? = null

    /**
     * The visibility of newly created repositories for which the code security configuration will be applied to by
     * default
     */
    public var defaultForNewRepos:
        InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02? = null

    public fun build(): InlineCodeSecurityDefaultConfigurationsItemXb1633561 = InlineCodeSecurityDefaultConfigurationsItemXb1633561(
      configuration = configuration,
      defaultForNewRepos = defaultForNewRepos,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeSecurityDefaultConfigurationsItemXb1633561 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodeSecurityDefaultConfigurationsItemXb1633561> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeSecurityDefaultConfigurationsItemXb1633561 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeSecurityDefaultConfigurationsItemXb1633561")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeSecurityDefaultConfigurationsItemXb1633561 must be a JSON object")
      return InlineCodeSecurityDefaultConfigurationsItemXb1633561(
        configuration = rawObject["configuration"]?.let { json.decodeFromJsonElement<CodeSecurityConfiguration>(it) },
        defaultForNewRepos = rawObject["default_for_new_repos"]?.let { json.decodeFromJsonElement<InlineCodeSecurityDefaultConfigurationsItemDefaultForNewReposX22fb9a02>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityDefaultConfigurationsItemXb1633561) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeSecurityDefaultConfigurationsItemXb1633561")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.configuration?.let { put("configuration", json.encodeToJsonElement(it)) }
        value.defaultForNewRepos?.let { put("default_for_new_repos", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeSecurityDefaultConfigurationsItemXb1633561(block: InlineCodeSecurityDefaultConfigurationsItemXb1633561.Builder.() -> Unit): InlineCodeSecurityDefaultConfigurationsItemXb1633561 = InlineCodeSecurityDefaultConfigurationsItemXb1633561.build(block)
