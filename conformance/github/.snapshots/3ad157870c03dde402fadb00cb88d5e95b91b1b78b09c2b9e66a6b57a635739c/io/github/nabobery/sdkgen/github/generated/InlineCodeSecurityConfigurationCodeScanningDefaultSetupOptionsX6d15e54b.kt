package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Feature options for code scanning default setup
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/code_scanning_default_setup_o
 * ptions
 */
@Serializable(with = InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b.Serializer::class)
public class InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b(
  /**
   * The label of the runner to use for code scanning when runner_type is 'labeled'.
   */
  public val runnerLabel: String? = null,
  /**
   * Whether to use labeled runners or standard GitHub runners.
   */
  public val runnerType:
      InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce? = null,
) {
  public class Builder {
    /**
     * The label of the runner to use for code scanning when runner_type is 'labeled'.
     */
    public var runnerLabel: String? = null

    /**
     * Whether to use labeled runners or standard GitHub runners.
     */
    public var runnerType:
        InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce? = null

    public fun build(): InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b = InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b(
      runnerLabel = runnerLabel,
      runnerType = runnerType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b must be a JSON object")
      return InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b(
        runnerLabel = rawObject["runner_label"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        runnerType = rawObject["runner_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.runnerLabel?.let { put("runner_label", it) }
        value.runnerType?.let { put("runner_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b(block: InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b.Builder.() -> Unit): InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b = InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b.build(block)
