package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pages-health-check/properties/alt_domain.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pages-health-check/properties/alt_domain
 */
@Serializable(with = InlinePagesHealthCheckAltDomainX15f3886e.Serializer::class)
public class InlinePagesHealthCheckAltDomainX15f3886e(
  public val caaError: String? = null,
  public val dnsResolves: Boolean? = null,
  public val enforcesHttps: Boolean? = null,
  public val hasCnameRecord: Boolean? = null,
  public val hasMxRecordsPresent: Boolean? = null,
  public val host: String? = null,
  public val httpsError: String? = null,
  public val isARecord: Boolean? = null,
  public val isApexDomain: Boolean? = null,
  public val isCloudflareIp: Boolean? = null,
  public val isCnameToFastly: Boolean? = null,
  public val isCnameToGithubUserDomain: Boolean? = null,
  public val isCnameToPagesDotGithubDotCom: Boolean? = null,
  public val isFastlyIp: Boolean? = null,
  public val isHttpsEligible: Boolean? = null,
  public val isNonGithubPagesIpPresent: Boolean? = null,
  public val isOldIpAddress: Boolean? = null,
  public val isPagesDomain: Boolean? = null,
  public val isPointedToGithubPagesIp: Boolean? = null,
  public val isProxied: Boolean? = null,
  public val isServedByPages: Boolean? = null,
  public val isValid: Boolean? = null,
  public val isValidDomain: Boolean? = null,
  public val nameservers: String? = null,
  public val reason: String? = null,
  public val respondsToHttps: Boolean? = null,
  public val shouldBeARecord: Boolean? = null,
  public val uri: String? = null,
) {
  public class Builder {
    public var caaError: String? = null

    public var dnsResolves: Boolean? = null

    public var enforcesHttps: Boolean? = null

    public var hasCnameRecord: Boolean? = null

    public var hasMxRecordsPresent: Boolean? = null

    public var host: String? = null

    public var httpsError: String? = null

    public var isARecord: Boolean? = null

    public var isApexDomain: Boolean? = null

    public var isCloudflareIp: Boolean? = null

    public var isCnameToFastly: Boolean? = null

    public var isCnameToGithubUserDomain: Boolean? = null

    public var isCnameToPagesDotGithubDotCom: Boolean? = null

    public var isFastlyIp: Boolean? = null

    public var isHttpsEligible: Boolean? = null

    public var isNonGithubPagesIpPresent: Boolean? = null

    public var isOldIpAddress: Boolean? = null

    public var isPagesDomain: Boolean? = null

    public var isPointedToGithubPagesIp: Boolean? = null

    public var isProxied: Boolean? = null

    public var isServedByPages: Boolean? = null

    public var isValid: Boolean? = null

    public var isValidDomain: Boolean? = null

    public var nameservers: String? = null

    public var reason: String? = null

    public var respondsToHttps: Boolean? = null

    public var shouldBeARecord: Boolean? = null

    public var uri: String? = null

    public fun build(): InlinePagesHealthCheckAltDomainX15f3886e = InlinePagesHealthCheckAltDomainX15f3886e(
      caaError = caaError,
      dnsResolves = dnsResolves,
      enforcesHttps = enforcesHttps,
      hasCnameRecord = hasCnameRecord,
      hasMxRecordsPresent = hasMxRecordsPresent,
      host = host,
      httpsError = httpsError,
      isARecord = isARecord,
      isApexDomain = isApexDomain,
      isCloudflareIp = isCloudflareIp,
      isCnameToFastly = isCnameToFastly,
      isCnameToGithubUserDomain = isCnameToGithubUserDomain,
      isCnameToPagesDotGithubDotCom = isCnameToPagesDotGithubDotCom,
      isFastlyIp = isFastlyIp,
      isHttpsEligible = isHttpsEligible,
      isNonGithubPagesIpPresent = isNonGithubPagesIpPresent,
      isOldIpAddress = isOldIpAddress,
      isPagesDomain = isPagesDomain,
      isPointedToGithubPagesIp = isPointedToGithubPagesIp,
      isProxied = isProxied,
      isServedByPages = isServedByPages,
      isValid = isValid,
      isValidDomain = isValidDomain,
      nameservers = nameservers,
      reason = reason,
      respondsToHttps = respondsToHttps,
      shouldBeARecord = shouldBeARecord,
      uri = uri,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePagesHealthCheckAltDomainX15f3886e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePagesHealthCheckAltDomainX15f3886e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePagesHealthCheckAltDomainX15f3886e {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePagesHealthCheckAltDomainX15f3886e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePagesHealthCheckAltDomainX15f3886e must be a JSON object")
      return InlinePagesHealthCheckAltDomainX15f3886e(
        caaError = rawObject["caa_error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        dnsResolves = rawObject["dns_resolves"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        enforcesHttps = rawObject["enforces_https"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasCnameRecord = rawObject["has_cname_record"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        hasMxRecordsPresent = rawObject["has_mx_records_present"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        host = rawObject["host"]?.let { json.decodeFromJsonElement<String>(it) },
        httpsError = rawObject["https_error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        isARecord = rawObject["is_a_record"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isApexDomain = rawObject["is_apex_domain"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        isCloudflareIp = rawObject["is_cloudflare_ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isCnameToFastly = rawObject["is_cname_to_fastly"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isCnameToGithubUserDomain = rawObject["is_cname_to_github_user_domain"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isCnameToPagesDotGithubDotCom = rawObject["is_cname_to_pages_dot_github_dot_com"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isFastlyIp = rawObject["is_fastly_ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isHttpsEligible = rawObject["is_https_eligible"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isNonGithubPagesIpPresent = rawObject["is_non_github_pages_ip_present"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isOldIpAddress = rawObject["is_old_ip_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isPagesDomain = rawObject["is_pages_domain"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        isPointedToGithubPagesIp = rawObject["is_pointed_to_github_pages_ip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isProxied = rawObject["is_proxied"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isServedByPages = rawObject["is_served_by_pages"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        isValid = rawObject["is_valid"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        isValidDomain = rawObject["is_valid_domain"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        nameservers = rawObject["nameservers"]?.let { json.decodeFromJsonElement<String>(it) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        respondsToHttps = rawObject["responds_to_https"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        shouldBeARecord = rawObject["should_be_a_record"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        uri = rawObject["uri"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePagesHealthCheckAltDomainX15f3886e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePagesHealthCheckAltDomainX15f3886e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.caaError?.let { put("caa_error", it) }
        value.dnsResolves?.let { put("dns_resolves", json.encodeToJsonElement(it)) }
        value.enforcesHttps?.let { put("enforces_https", json.encodeToJsonElement(it)) }
        value.hasCnameRecord?.let { put("has_cname_record", json.encodeToJsonElement(it)) }
        value.hasMxRecordsPresent?.let { put("has_mx_records_present", json.encodeToJsonElement(it)) }
        value.host?.let { put("host", it) }
        value.httpsError?.let { put("https_error", it) }
        value.isARecord?.let { put("is_a_record", json.encodeToJsonElement(it)) }
        value.isApexDomain?.let { put("is_apex_domain", json.encodeToJsonElement(it)) }
        value.isCloudflareIp?.let { put("is_cloudflare_ip", json.encodeToJsonElement(it)) }
        value.isCnameToFastly?.let { put("is_cname_to_fastly", json.encodeToJsonElement(it)) }
        value.isCnameToGithubUserDomain?.let { put("is_cname_to_github_user_domain", json.encodeToJsonElement(it)) }
        value.isCnameToPagesDotGithubDotCom?.let { put("is_cname_to_pages_dot_github_dot_com", json.encodeToJsonElement(it)) }
        value.isFastlyIp?.let { put("is_fastly_ip", json.encodeToJsonElement(it)) }
        value.isHttpsEligible?.let { put("is_https_eligible", json.encodeToJsonElement(it)) }
        value.isNonGithubPagesIpPresent?.let { put("is_non_github_pages_ip_present", json.encodeToJsonElement(it)) }
        value.isOldIpAddress?.let { put("is_old_ip_address", json.encodeToJsonElement(it)) }
        value.isPagesDomain?.let { put("is_pages_domain", json.encodeToJsonElement(it)) }
        value.isPointedToGithubPagesIp?.let { put("is_pointed_to_github_pages_ip", json.encodeToJsonElement(it)) }
        value.isProxied?.let { put("is_proxied", json.encodeToJsonElement(it)) }
        value.isServedByPages?.let { put("is_served_by_pages", json.encodeToJsonElement(it)) }
        value.isValid?.let { put("is_valid", json.encodeToJsonElement(it)) }
        value.isValidDomain?.let { put("is_valid_domain", json.encodeToJsonElement(it)) }
        value.nameservers?.let { put("nameservers", it) }
        value.reason?.let { put("reason", it) }
        value.respondsToHttps?.let { put("responds_to_https", json.encodeToJsonElement(it)) }
        value.shouldBeARecord?.let { put("should_be_a_record", json.encodeToJsonElement(it)) }
        value.uri?.let { put("uri", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePagesHealthCheckAltDomainX15f3886e(block: InlinePagesHealthCheckAltDomainX15f3886e.Builder.() -> Unit): InlinePagesHealthCheckAltDomainX15f3886e = InlinePagesHealthCheckAltDomainX15f3886e.build(block)
